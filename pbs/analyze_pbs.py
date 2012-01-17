
from pbs_utils import *

[Wmodel, Amodel, Rmodel, Smodel] = read_latencies("test.out")

N = 2
t = 0
k = 1

ITERATIONS = 10000

result = calc_prob_fresh(N, 2, 1, t, k, ITERATIONS, Wmodel, Amodel, Rmodel, Smodel)

for r in range(1, N+1):
    for w in range(1, N+1):
        if r + w > N+1:
            continue
        result = calc_prob_fresh(N, r, w, t, k, ITERATIONS, Wmodel, Amodel, Rmodel, Smodel)
        print ("N=%d, R=%d, W=%d\nProbability of fresh reads: %f\nAverage read latency %.2fms\nAverage write latency %.2fms\n" % 
               (N, r, w, result.prob_fresh, result.rlat, result.wlat))
