
from pbs_utils import *

[Wmodel, Amodel, Rmodel, Smodel] = read_latencies("sampleout.out")

print Wmodel.get_next_latency(1)
