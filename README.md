PBS WARS for Cassandra
==========

*Probabilistically Bounded Staleness describes the probability that an
 eventually consistent data store returns consistent data.*

Read about PBS here: http://cs.berkeley.edu/~pbailis/projects/pbs/

#### Overview

This code instruments [Cassandra](https://github.com/apache/cassandra)
to gather latency traces (*WARS*) for use in modeling.

To view the WARS latencies, run `nodetool` with the
`pbswars` option: e.g., <pre>bin/nodetool -h *host* pbswars</pre>

By default, latencies are presented ordered by which number response
they correspond to (e.g., the latencies of the first *W*, *A*,
*R*,*S*, then the second, and so on).  To see unordered latencies
(useful under independence assumptions), run <pre>nodetool</pre> with
the <pre>pbswwarsunordered</pre>.

#### Caveats

The code currently requires globally synchronized clocks and only
records remote operations.  We can fix the latter if required (e.g.,
logging local reads as "zero latency").