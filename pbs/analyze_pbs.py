
from pbsutils.pbs_utils import *
from sys import argv
import yaml

config = yaml.load(open("pbs-params.yaml"))

N = config["N"]
t = config["t"]
k = config["k"]
iterations = config["iterations"]

if config["assume_iid"]:
    latency_parser = read_latencies_IID
else:
    latency_parser = read_latencies

[Wmodel, Amodel, Rmodel, Smodel] = latency_parser(config["latencymodel"])

print "PBS Analysis Tool\nAt time %.2fms and maximum version staleness of k=%d:\n" % (t, k)

for r in range(1, N+1):
    for w in range(1, N+1):
        if r + w > N+1:
            continue
        result = calc_prob_fresh(N, r, w, t, k, iterations, Wmodel, Amodel, Rmodel, Smodel)
        print (
"""N=%d, R=%d, W=%d
Probability of fresh reads: %f
Average read latency %.2fms  (99.9th %%ile: %.2f)
Average write latency %.2fms (99.9th %%ile: %.2f)
""" % 
(N,
 r,
 w,
 result.prob_fresh,
 average(result.rlats),
 get_percentile(.999, result.rlats),
 average(result.wlats),
 get_percentile(.999, result.wlats)))
