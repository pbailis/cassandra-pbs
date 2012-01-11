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

import org.apache.cassandra.net.Message;

import java.lang.management.ManagementFactory;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Vector;
import javax.management.MBeanServer;
import javax.management.ObjectName;

// Maintains latencies of WARS operations
// Using LatencyTracker would be nice but would lose order statistic properties
// Eventually, may be used to optimize N,R,W configurations online

public class PBSTracker implements PBSTrackerMBean
{
    public static final String MBEAN_NAME = "org.apache.cassandra.service:type=PBSTracker";

    static
    {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        try
        {
            mbs.registerMBean(new PBSTracker(), new ObjectName(MBEAN_NAME));
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    // todo: make config option instead of static compile
    private static final long MAX_ENTRIES = 10000;

    private static final Map<String, Long> messageIdToStartTimes = new ConcurrentHashMap<String, Long>();

    // used for LRU replacement
    private static final Queue<String> messageIds = new ConcurrentLinkedQueue<String>();

    // We keep each message ID's response times separate for use in more complex latency models, where we
    // explicitly consider the response time of the ith response, instead of assuming the latencies are
    // independently, identically distributed (IID).

    private static final Map<String, Collection<Long>> messageIdToWLatencies =
            new ConcurrentHashMap<String, Collection<Long>>();
    private static final Map<String, Collection<Long>> messageIdToALatencies =
            new ConcurrentHashMap<String, Collection<Long>>();
    private static final Map<String, Collection<Long>> messageIdToRLatencies =
            new ConcurrentHashMap<String, Collection<Long>>();
    private static final Map<String, Collection<Long>> messageIdToSLatencies =
            new ConcurrentHashMap<String, Collection<Long>>();

    public static void startOperation(String id)
    {
        assert(!messageIdToStartTimes.containsKey(id));

        messageIdToStartTimes.put(id, System.currentTimeMillis());

        messageIds.add(id);

        // LRU replacement of latencies
        // the maximum number of entries is sloppy, but that's acceptable for our purposes
        if(messageIds.size() > MAX_ENTRIES)
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

    public static void logWriteResponse(String id, Message response)
    {
        // may be evicted; unlikely, but need to check
        if(!messageIdToStartTimes.containsKey(id))
        {
            return;
        }

        long time = System.currentTimeMillis();
        messageIdToWLatencies.get(id).add(response.getCreationTime()-messageIdToStartTimes.get(id));
        messageIdToALatencies.get(id).add(time-response.getCreationTime());
    }

    public static void logReadResponse(String id, Message response)
    {
        // may be evicted; unlikely, but need to check
        if(!messageIdToStartTimes.containsKey(id))
        {
            return;
        }

        long time = System.currentTimeMillis();
        messageIdToRLatencies.get(id).add(response.getCreationTime()-messageIdToStartTimes.get(id));
        messageIdToSLatencies.get(id).add(time-response.getCreationTime());
    }

    // We support two modes of latency retrieval:
    //      Unordered latency retrieval means that all latencies are returned, whether they
    //        are the first or the last
    //      Ordered latency retrieval means that the latencies of the first to nth responses
    //        are returned, separated by key.

    public List<Long> getUnorderedWLatencies()
    {
        return getUnorderedLatencies(messageIdToWLatencies.values());
    }

    public Map<Integer, List<Long>> getOrderedWLatencies()
    {
        return getOrderedLatencies(messageIdToWLatencies.values());
    }

    public List<Long> getUnorderedALatencies()
    {
        return getUnorderedLatencies(messageIdToALatencies.values());
    }

    public Map<Integer, List<Long>> getOrderedALatencies()
    {
        return getOrderedLatencies(messageIdToALatencies.values());
    }

    public List<Long> getUnorderedRLatencies()
    {
        return getUnorderedLatencies(messageIdToRLatencies.values());
    }

    public Map<Integer, List<Long>> getOrderedRLatencies()
    {
        return getOrderedLatencies(messageIdToRLatencies.values());
    }

    public List<Long> getUnorderedSLatencies()
    {
        return getUnorderedLatencies(messageIdToSLatencies.values());
    }

    public Map<Integer, List<Long>> getOrderedSLatencies()
    {
        return getOrderedLatencies(messageIdToSLatencies.values());
    }

    static List<Long> getUnorderedLatencies(Collection<Collection<Long>> latencyLists)
    {
        Vector<Long> ret = new Vector<Long>();

        for(List<Long> subReturn : getOrderedLatencies(latencyLists).values())
        {
            ret.addAll(subReturn);
        }

        return ret;
    }

    static Map<Integer, List<Long>> getOrderedLatencies(Collection<Collection<Long>> latencyLists)
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
