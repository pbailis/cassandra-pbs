PBS WARS for Cassandra
==========

*Probabilistically Bounded Staleness describes the probability that an
 eventually consistent data store returns consistent data.*

Read about PBS here: http://cs.berkeley.edu/~pbailis/projects/pbs/

#### Overview

This code instruments [Cassandra](https://github.com/apache/cassandra)
to gather latency traces (*WARS*, in milliseconds) for use in modeling
and uses these traces to predict the probability of consistency based
on those traces.

To view the WARS latencies, run `nodetool` with the
`pbswars` option (e.g., `bin/nodetool -h *host* pbswars`).

By default, latencies are presented ordered by which number response
they correspond to (e.g., the latencies of the first *W*,*A*,*R*, and
*S* received for each request, then the second set, and so on).  To
see unordered latencies (useful under independence assumptions), run
`nodetool` with the `pbswwarsunordered` option.

To evaluate the probability of consistency given a set of traces, run
`pbs/analyze_pbs.py *trace-file-name*`.  Parameters are currently
stored within the Python script and include the replication factor
(*N*), the time waited after a write before reading (*t*), the number
of tolerable versions of staleness (*k*), the number of Monte Carlo
simulations (*ITERATIONS*), and whether or not latencies are
independently, identically distributed (*IID_assumption*, see Caveats
section).

#### Example usage

`bin/nodetool -h testlatencies.out && python pbs/analyze_pbs.py testlatencies.out`

Output:
`PBS Analysis Tool
At time 0.00ms, 1 maximum version staleness:

N=3, R=1, W=1
Probability of fresh reads: 0.864730
Average read latency 8.70ms
Average write latency 8.71ms

...`

#### Caveats

The code currently requires globally synchronized clocks and only
records remote operations.  We can fix the latter if required (e.g.,
logging local reads as "zero latency").  This means that if you have
exactly *n* replicas, you probably won't have enough latency data to
run simulations where *N*=*n*.  To fix this, you can make IID
assumptions by setting the *IID_assumption* variable to `True`.

We currently log (maximum) 10,000 WARS operation latencies according
to a LRU policy; we can make this number variable in `cassandra.yaml`.

This is a clean rewrite of the code we used in our [tech
report](http://www.eecs.berkeley.edu/Pubs/TechRpts/2012/EECS-2012-4.pdf).
We've done some rough checks to make sure the simulations align, but
the main benefit of this code is readability and conciseness.  Note
that the Python code does *not* make independence assumptions 