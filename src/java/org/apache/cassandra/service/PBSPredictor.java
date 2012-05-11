/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.cassandra.service;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.net.MessageIn;
import org.apache.cassandra.net.MessageOut;


import java.lang.management.ManagementFactory;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
  ===OVERVIEW===

  This class performs latency and consistency predictions as described
  in "Probabilistically Bounded Staleness for Practical Partial
  Quorums" by Bailis et al. in VLDB 2012. The predictions are of the
  form:

  "With ReplicationFactor N, read consistency level of R, and write
  consistency level W, after t seconds, p% of reads will return a
  version within k versions of the last written; this should result in
  a latency of L ms."

  These predictions should be used as a rough guideline for system
  operators. This interface is exposed through nodetool.

  ===LATENCY GATHERING===

  The class accomplishes this by measuring latencies for reads and
  writes, then using Monte Carlo simulation to predict behavior under
  a given N,R, and W based on those latencies.

  We capture four distributions:

  --W: time from when the coordinator sends a mutation to the time
    that a replica begins to serve the new value(s)

  --A: time from when a replica accepting a mutation sends an
    acknowledgment to the time the coordinator hears of it

  --R: time from when the coordinator sends a read request to the time
    that the replica performs the read

  --S: time from when the replica sends a read response to the time
    when the coordinator receives it

  A and S are mostly network-bound, while W and R depend on both the
  network and local processing time.

  ===CAVEATS===

  Prediction is only as good as the latencies collected. Accurate
  prediction requires synchronizing clocks between replicas.  We
  collect a running sample of latencies, but, if latencies change
  dramatically, predictions will be off.

  The predictions are conservative, or worst-case, meaning we may
  predict more staleness than in practice in the following ways:
    --We do not account for read repair. 
    --We do not account for Merkle tree exchange.
    --Multi-version staleness is particularly conservative.
    --We simulate non-local reads and writes. We assume that the
      coordinating Cassandra node is not itself a replica for a given key.

  The predictions are optimistic in the following ways:
    --We do not predict the impact of node failure.
    --We do not model hinted handoff.
 */

public class PBSPredictor implements PBSPredictorMBean
{
    private static final Logger logger = LoggerFactory.getLogger(PBSPredictor.class);

    public static final String MBEAN_NAME = "org.apache.cassandra.service:type=PBSPredictor";

    /*
        We record a fixed size set of WARS latencies for read and
        mutation operations.  We store the order in which each
        operation arrived, and use an LRU policy to evict old
        messages.

        This information is stored as a mapping from messageIDs to
        latencies.
     */

    private final Map<String, Long> messageIdToStartTimes = new ConcurrentHashMap<String, Long>();

    // used for LRU replacement
    private final Queue<String> messageIds = new ConcurrentLinkedQueue<String>();

    private final Map<String, Collection<Long>> messageIdToWLatencies =
            new ConcurrentHashMap<String, Collection<Long>>();
    private final Map<String, Collection<Long>> messageIdToALatencies =
            new ConcurrentHashMap<String, Collection<Long>>();
    private final Map<String, Collection<Long>> messageIdToRLatencies =
            new ConcurrentHashMap<String, Collection<Long>>();
    private final Map<String, Collection<Long>> messageIdToSLatencies =
            new ConcurrentHashMap<String, Collection<Long>>();

    private Random random;
    private boolean doLog = false;
    private boolean initialized = false;

    private static final PBSPredictor instance = new PBSPredictor();

    public static PBSPredictor instance()
    {
        return instance;
    }

    private PBSPredictor()
    {
        init();
    }

    public void init()
    {
        if (!initialized) {
          doLog = DatabaseDescriptor.logLatenciesForConsistencyPrediction();
          random = new Random();

          MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
          try
          {
              mbs.registerMBean(this, new ObjectName(PBSPredictor.MBEAN_NAME));
          }
          catch (Exception e)
          {
              throw new RuntimeException(e);
          }
          initialized = true;
        }
    }
  	

    // used for random sampling from the latencies
    private long getRandomElement(List<Long> list)
    {
        if(list.size() == 0)
            throw new RuntimeException("Not enough data for prediction");
        return list.get(random.nextInt(list.size()));
    }

    // used for calculating the average latency of a read or write operation
    // given a set of simulated latencies
    private float listAverage(List<Long> list)
    {
        long accum = 0;
        for (long value : list) accum += value;
        return (float) accum / list.size();
    }

    // calculate the percentile entry of a list
    private long getPercentile(List<Long> list, float percentile)
    {
        Collections.sort(list);
        return list.get((int)(list.size()*percentile));
    }

    // for our trials, sample the latency for the (replicaNumber)th
    // reply for one of WARS
    // if replicaNumber > the number of replicas we have data for
    //    (say we have data for ReplicationFactor 2 but ask for N=3)
    // then we randomly sample from all response times
    private long getRandomLatencySample(Map<Integer, List<Long>> samples, int replicaNumber)
    {
        if(samples.containsKey(replicaNumber))
        {
            return getRandomElement(samples.get(replicaNumber));
        }

        return getRandomElement(samples.get(samples.keySet().toArray()[random.nextInt(samples.keySet().size())]));
    }

    /*
        To perform the prediction, we randomly sample from the
        collected WARS latencies, simulating writes followed by reads
        exactly t milliseconds afterwards. We count the number of
        reordered reads and writes to calculate the probability of
        staleness along with recording operation latencies.
     */

    public PBSPredictionResult doPrediction(int n,
                                            int r,
                                            int w,
                                            float timeSinceWrite,
                                            int numberVersionsStale,
                                            float percentileLatency)
    {
        assert r <= n;
        assert r > 0;
        assert w <= n;
        assert w > 0;
        assert percentileLatency > 0 && percentileLatency < 1;

        if(!doLog)
            return null;

        try {
            // get a mapping of {replica number : latency} for each of WARS
            Map<Integer, List<Long>> wLatencies = getOrderedWLatencies();
            Map<Integer, List<Long>> aLatencies = getOrderedALatencies();
            Map<Integer, List<Long>> rLatencies = getOrderedRLatencies();
            Map<Integer, List<Long>> sLatencies = getOrderedSLatencies();

            if (wLatencies.isEmpty() || rLatencies.isEmpty() || 
                aLatencies.isEmpty() || sLatencies.isEmpty()) {
              return null;
            }

            // storage for simulated read and write latencies
            ArrayList<Long> readLatencies = new ArrayList<Long>();
            ArrayList<Long> writeLatencies = new ArrayList<Long>();

            long consistentReads = 0;

            // storage for latencies for each replica for a given Monte Carlo trial
            // arr[i] will hold the ith replica's latency for one of WARS
            ArrayList<Long> trialWLatencies = new ArrayList<Long>();
            ArrayList<Long> trialALatencies = new ArrayList<Long>();
            ArrayList<Long> trialRLatencies = new ArrayList<Long>();
            ArrayList<Long> trialSLatencies = new ArrayList<Long>();

            ArrayList<Long> replicaWriteLatencies = new ArrayList<Long>();
            ArrayList<Long> replicaReadLatencies = new ArrayList<Long>();

            long numTrials = DatabaseDescriptor.getNumberTrialsForConsistencyPrediction();

            //run repeated trials and observe staleness
            for(long i = 0; i < numTrials; ++i)
            {
                //simulate sending a write to N replicas then sending a
                //read to N replicas and record the latencies by randomly
                //sampling from gathered latencies
                for(int replicaNo = 0; replicaNo < n; ++replicaNo)
                {
                    long trialWLatency = getRandomLatencySample(wLatencies, replicaNo);
                    long trialALatency = getRandomLatencySample(aLatencies, replicaNo);
                    long trialRLatency = getRandomLatencySample(rLatencies, replicaNo);
                    long trialSLatency = getRandomLatencySample(sLatencies, replicaNo);

                    trialWLatencies.add(trialWLatency);
                    trialALatencies.add(trialALatency);
                    trialRLatencies.add(trialRLatency);
                    trialSLatencies.add(trialSLatency);

                    replicaWriteLatencies.add(trialWLatency + trialALatency);
                    replicaReadLatencies.add(trialRLatency + trialSLatency);
                }

                // the write latency for this trial is the time it takes
                // for the wth replica to respond (W+A)
                Collections.sort(replicaWriteLatencies);
                long writeLatency = replicaWriteLatencies.get(w-1);
                writeLatencies.add(writeLatency);

                ArrayList<Long> sortedReplicaReadLatencies = new ArrayList<Long>(replicaReadLatencies);
                Collections.sort(sortedReplicaReadLatencies);

                // the read latency for this trial is the time it takes
                // for the rth replica to respond (R+S)
                readLatencies.add(sortedReplicaReadLatencies.get(r-1));

                // were all of the read responses reordered?

                // for each of the first r messages (the ones the
                // coordinator will pick from):
                //--if the read message came in after this replica saw the
                // write, it will be consistent
                //--each read request is sent at time
                // writeLatency+timeSinceWrite

                for(int response = 0; response < r; ++response) {
                    int replicaNumber = sortedReplicaReadLatencies.indexOf(sortedReplicaReadLatencies.get(0));
                    // if the
                    if(writeLatency + timeSinceWrite + trialRLatencies.remove(replicaNumber) >=
                            trialWLatencies.remove(replicaNumber))
                    {
                        consistentReads++;
                        break;
                    }
                }

                // clear storage for the next trial
                trialWLatencies.clear();
                trialALatencies.clear();
                trialRLatencies.clear();
                trialSLatencies.clear();

                replicaReadLatencies.clear();
                replicaWriteLatencies.clear();
            }

            float oneVersionConsistencyProbability = (float)consistentReads/numTrials;

            // to calculate multi-version staleness, we exponentiate the staleness probability by the number of versions
            float consistencyProbability = (float) (1-Math.pow((double)(1-oneVersionConsistencyProbability),
                                                               numberVersionsStale));

            float averageWriteLatency = listAverage(writeLatencies);
            float averageReadLatency = listAverage(readLatencies);

            long percentileWriteLatency = getPercentile(writeLatencies, percentileLatency);
            long percentileReadLatency = getPercentile(readLatencies, percentileLatency);

            return new PBSPredictionResult(n,
                                           r,
                                           w,
                                           timeSinceWrite,
                                           numberVersionsStale,
                                           consistencyProbability,
                                           averageReadLatency,
                                           averageWriteLatency,
                                           percentileReadLatency,
                                           percentileLatency,
                                           percentileWriteLatency,
                                           percentileLatency);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public void startOperation(String id)
    {
        if(!doLog)
            return;

        assert(!messageIdToStartTimes.containsKey(id));

        messageIdToStartTimes.put(id, System.currentTimeMillis());

        messageIds.add(id);

        // LRU replacement of latencies
        // the maximum number of entries is sloppy, but that's acceptable for our purposes
        if(messageIds.size() > DatabaseDescriptor.getMaxLoggedLatenciesForConsistencyPrediction())
        {
            String toEvict = messageIds.remove();
            messageIdToStartTimes.remove(toEvict);
            messageIdToWLatencies.remove(toEvict);
            messageIdToALatencies.remove(toEvict);
            messageIdToRLatencies.remove(toEvict);
            messageIdToSLatencies.remove(toEvict);
        }

        messageIdToWLatencies.put(id, new ConcurrentLinkedQueue<Long>());
        messageIdToALatencies.put(id, new ConcurrentLinkedQueue<Long>());
        messageIdToRLatencies.put(id, new ConcurrentLinkedQueue<Long>());
        messageIdToSLatencies.put(id, new ConcurrentLinkedQueue<Long>());
    }

    public void logWriteResponse(String id, MessageIn response)
    {
        if(!doLog)
            return;

        Long startTime = messageIdToStartTimes.get(id);
        if(startTime == null)
        {
            return;
        }

        long time = System.currentTimeMillis();

        Collection<Long> wLatencies = messageIdToWLatencies.get(id);
        if(wLatencies == null)
        {
            return;
        }

        wLatencies.add(Math.max(0, response.creationTime - startTime));

        Collection<Long> aLatencies = messageIdToALatencies.get(id);
        if(aLatencies == null)
        {
            return;
        }

        aLatencies.add(Math.max(0, time - response.creationTime));
    }

    public void logReadResponse(String id, MessageIn response)
    {
        if(!doLog)
            return;

        Long startTime = messageIdToStartTimes.get(id);
        if(startTime == null)
        {
            return;
        }

        long time = System.currentTimeMillis();

        Collection<Long> rLatencies = messageIdToRLatencies.get(id);
        if(rLatencies == null)
        {
            return;
        }

        rLatencies.add(Math.max(0, response.creationTime-startTime));

        Collection<Long> sLatencies = messageIdToSLatencies.get(id);
        if(sLatencies == null)
        {
            return;
        }
        sLatencies.add(Math.max(0, time-response.creationTime));
    }

    Map<Integer, List<Long>> getOrderedWLatencies()
    {
        return getOrderedLatencies(messageIdToWLatencies.values());
    }

    Map<Integer, List<Long>> getOrderedALatencies()
    {
        return getOrderedLatencies(messageIdToALatencies.values());
    }

    Map<Integer, List<Long>> getOrderedRLatencies()
    {
        return getOrderedLatencies(messageIdToRLatencies.values());
    }

    Map<Integer, List<Long>> getOrderedSLatencies()
    {
        return getOrderedLatencies(messageIdToSLatencies.values());
    }

    // Return the collected latencies indexed by response number instead of by messageID
    private Map<Integer, List<Long>> getOrderedLatencies(Collection<Collection<Long>> latencyLists)
    {
        Map<Integer, List<Long>> ret = new HashMap<Integer, List<Long>>();

        // N may vary
        int maxResponses = 0;

        for(Collection<Long> latencies : latencyLists)
        {
            List<Long> sortedLatencies = new ArrayList<Long>(latencies);
            Collections.sort(sortedLatencies);

            if(sortedLatencies.size() > maxResponses)
            {
                for(int i = maxResponses+1; i <= sortedLatencies.size(); ++i)
                {
                    ret.put(i, new Vector<Long>());
                }

                maxResponses = sortedLatencies.size();
            }

            // indexing by 0 is awkward since we're talking about the ith response
            for(int i = 1; i <= sortedLatencies.size(); ++i)
            {
                ret.get(i).add(sortedLatencies.get(i-1));
            }
        }

        return ret;
    }
}
