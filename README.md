PBS WARS for Cassandra
==========

*Probabilistically Bounded Staleness describes the probability that an
 eventually consistent data store returns consistent data.*

Read about PBS here: http://cs.berkeley.edu/~pbailis/projects/pbs/

#### Overview

This code instruments [Cassandra](https://github.com/apache/cassandra)
to gather latency traces (*WARS*) for use in modeling.

To view the WARS latencies, run `nodetool` with the
`pbswars` option (e.g., `bin/nodetool -h *host* pbswars`).

By default, latencies are presented ordered by which number response
they correspond to (e.g., the latencies of the first *W*,*A*,*R*, and
*S* received for each request, then the second set, and so on).  To
see unordered latencies (useful under independence assumptions), run
`nodetool` with the `pbswwarsunordered` option.

#### Caveats

The code currently requires globally synchronized clocks and only
records remote operations.  We can fix the latter if required (e.g.,
logging local reads as "zero latency").

Also, we currently log (maximum) 10,000 WARS operation latencies
according to a LRU policy; we can make this number variable in
`cassandra.yaml`.