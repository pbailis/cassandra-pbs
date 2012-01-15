
from latency_model import *

def read_latencies(f):
    lats = []
    for line in open(f):
        line = line.strip('\n')
        if line == "w latencies":
            curlatencies = {}
        elif line == "a latencies" or line == "r latencies" or line == "s latencies":
            lats.append(curlatencies)
            curlatencies = {}
        elif line.find("replica number") != -1:
            curreplica = int(line.split()[2])
            curlatencies[curreplica] = []
        else:
            curlatencies[curreplica].append(int(line))

    lats.append(curlatencies)

    return [LatencyModel(lat) for lat in lats]
        
