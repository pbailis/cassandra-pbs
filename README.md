PBS for Cassandra
==========

*Probabilistically Bounded Staleness (PBS) describes the probability that an
 eventually consistent data store returns consistent data.*

[You can read about PBS in plain English and play with a cool demo in
your browser!](http://cs.berkeley.edu/~pbailis/projects/pbs/)

This is a clean rewrite of the code we used in our [tech
report](http://www.eecs.berkeley.edu/Pubs/TechRpts/2012/EECS-2012-4.pdf).
The main purpose of this Cassandra fork and accompanying analysis code
is to provide a concise, readable implementation of PBS in a real data
store. We've favored patch brevity over optimizations that might be
worthwhile someday (e.g., wire protocol changes). We've done some
basic checking to ensure that this code matches the original
implementation from our paper.

We've implemented the analysis portion in Python, but, after making
some design decisions about the best UI, it'd be trivial (a day or so)
to implement it in Java and make it accessible via `nodetool` or
similar.

Please feel free to [contact
us](http://www.eecs.berkeley.edu/~pbailis/projects/pbs/#moreinfo) with
any questions.

#### Description

This code instruments [Cassandra](https://github.com/apache/cassandra)
to gather latency traces (*WARS*, in milliseconds) for use in modeling
and uses these traces to predict the probability of consistency based
on those traces.  ([Basic
patch](https://raw.github.com/pbailis/cassandra-pbs/trunk/cassandra-pbs-basic.patch))
([Basic analysis
script](https://github.com/pbailis/cassandra-pbs/blob/trunk/pbs/analyze_pbs.py)
and
[functions](https://github.com/pbailis/cassandra-pbs/blob/trunk/pbs/pbsutils/pbs_utils.py))

To view the WARS latencies, run `nodetool` with the
`pbswars` option (e.g., `bin/nodetool -h *host* pbswars`).

By default, latencies are presented ordered by which number response
they correspond to (e.g., the latencies of the first *W*,*A*,*R*, and
*S* received for each request, then the second set, and so on).  To
see unordered latencies (useful under independence assumptions), run
`nodetool` with the `pbswwarsunordered` option.

To evaluate the probability of consistency given a set of traces, run
`pbs/analyze_pbs.py`.  Parameters are currently stored within
`pbs/pbs-params.yaml` and include the replication factor (*N*), the
time waited after a write commits before issuing a read (*t*, or
*t*-visibility), the number of tolerable versions of staleness (*k*),
the number of Monte Carlo simulations (*ITERATIONS*), and whether or
not latencies are independently, identically distributed
(*IID_assumption*, see Caveats section).

#### Example usage

`bin/nodetool -h localhost pbswars > testlatencies.out` then edit
`pbs/pbs-params.yaml` so `latencymodel` points to `testlatencies.out`, then run
`python pbs/analyze_pbs.py`:

Output:
<pre>
PBS Analysis Tool
At time 0.00ms and maximum version staleness of k=1:

N=3, R=1, W=1
Probability of fresh reads: 0.864730
Average read latency 8.70ms
Average write latency 8.71ms

...
</pre>

#### Caveats

The code currently requires globally synchronized clocks and only
records remote operations.  We can fix the latter if required (e.g.,
logging local reads as "zero latency").  This means that if you have
exactly *n* replicas, you probably won't have enough latency data to
run simulations where *N*=*n*.  To fix this, you can make IID
assumptions by setting the *IID_assumption* variable to `True`.  Note
that the Python code does *not* make independence assumptions by
default (as we do in the TR).

We currently log (maximum) 10,000 WARS operation latencies according
to a LRU policy; we can make this number variable in `cassandra.yaml`.
The wire protocol can also be made more lightweight (at the expense of
a more complicated patch!).

