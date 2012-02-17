
from random import random, expovariate, paretovariate

numpoints = 1000

out = open("generatedyammer.latencymodel", 'w')

w_pareto_min = 3.0
w_pareto_shape = 3.35
w_exponential_lambda = .0028
w_pareto_probability = .939

ars_pareto_min = 1.5
ars_pareto_shape = 3.8
ars_exponential_lambda = .0217
ars_pareto_probability = .982

out.write("w latencies\nreplica number 1\n")
for i in range(0, numpoints):
    if random() < w_pareto_probability:
        out.write("%f\n" % (w_pareto_min/pow(random(), 1/w_pareto_shape)))
    else:
        out.write("%f\n" % expovariate(w_exponential_lambda))

for latencykind in ["a", "r", "s"]:
    out.write("%s latencies\nreplica number 1\n" % (latencykind))
    for i in range(0, numpoints):
        if random() < ars_pareto_probability:
            out.write("%f\n" %  (ars_pareto_min/pow(random(), 1/ars_pareto_shape)))
        else:
            out.write("%f\n" % expovariate(ars_exponential_lambda))




