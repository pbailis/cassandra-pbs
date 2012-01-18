
from pbs_utils import *
from sys import argv

N = 3
t = 0
k = 1

ITERATIONS = 100000

IID_assumption = False

if len(argv) != 2:
    print "usage: python analyze_pbs.py *latencyfile*"
    exit(-1)

if IID_assumption:
    latency_parser = read_latencies_IID
else:
    latency_parser = read_latencies

[Wmodel, Amodel, Rmodel, Smodel] = latency_parser(argv[1])

print "PBS Analysis Tool\nAt time %.2fms, %d maximum version staleness:\n" % (t, k)

for r in range(1, N+1):
    for w in range(1, N+1):
        if r + w > N+1:
            continue
        result = calc_prob_fresh(N, r, w, t, k, ITERATIONS, Wmodel, Amodel, Rmodel, Smodel)
        print ("N=%d, R=%d, W=%d\nProbability of fresh reads: %f\nAverage read latency %.2fms\nAverage write latency %.2fms\n" % 
               (N, r, w, result.prob_fresh, result.rlat, result.wlat))
