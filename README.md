PBS WARS for Cassandra
==========

*Probabilistically Bounded Staleness describes the probability that an
 eventually consistent data store returns consistent data.*

Read about PBS here: http://cs.berkeley.edu/~pbailis/projects/pbs/

#### Overview

This code instruments [Cassandra](https://github.com/apache/cassandra)
to gather latency traces (*WARS*) for use in modeling.  You'll need to
parse the output to gather individual latencies; we can provide code
for this as well upon request.

#### Description

All Cassandra instances log timing locally; to construct *WARS*,
you'll need to gather the logs from all of the servers.  The write and
read start times are recorded in
[net/MessagingService.java](https://github.com/pbailis/cassandra-pbs/blob/trunk/src/java/org/apache/cassandra/net/MessagingService.java).
Replicas record the time they send a write acknowledgment in
[db/RowMutationVerbHandler.java](https://github.com/pbailis/cassandra-pbs/blob/trunk/src/java/org/apache/cassandra/db/RowMutationVerbHandler.java)
and the time they send a read response in
[db/ReadVerbHandler.java](https://github.com/pbailis/cassandra-pbs/blob/trunk/src/java/org/apache/cassandra/db/ReadVerbHandler.java).
The coordinator records the time it receives their responses in
[net/ResponseVerbHandler.java](https://github.com/pbailis/cassandra-pbs/blob/trunk/src/java/org/apache/cassandra/net/ResponseVerbHandler.java).

#### Caveats

The code currently requires globally synchronized clocks and only
records remote operations.  We can fix the latter if required.