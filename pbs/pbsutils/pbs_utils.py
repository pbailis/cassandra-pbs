
from latency_model import *
from sim_result import *

def average(values):
    return sum(values, 0.0) / len(values)

def calc_prob_fresh(N, R, W, t, k, iterations, Wmodel, Amodel, Rmodel, Smodel):
    current = 0

    all_read_lats = []
    all_write_lats = []

    for i in range(0, iterations):
        Ws = []
        As = []
        writelats = []
        Rs = []
        Ss = []
        readlats = []

        for replicano in range(1, N+1):
            thisW = Wmodel.get_next_latency(replicano)
            thisA = Amodel.get_next_latency(replicano)

            Ws.append(thisW)
            As.append(thisA)
            writelats.append(thisW+thisA)
            
            thisR = Rmodel.get_next_latency(replicano)
            thisS = Smodel.get_next_latency(replicano)
        
            Rs.append(thisR)
            Ss.append(thisS)
            readlats.append(thisR+thisS)

        writelats.sort()
        write_time = writelats[W-1]
        all_write_lats.append(write_time)

        sortedreads = sorted(readlats)
        all_read_lats.append(sortedreads[R-1])

        #were all of the first R responses reordered?
        for response in sortedreads[:R]:
            replicano = readlats.index(response)

            if write_time + Rs.pop(replicano) + t >= Ws.pop(replicano):
                current += 1
                break

            # remove response in case of duplicate response times;
            # taken care of in Rs and Ws by pop operation
            readlats.remove(response)

    return SimResult(1-pow(float(iterations-current)/iterations, k), 
                     average(all_read_lats), 
                     average(all_write_lats))

'''
Assumes f is file of following form (all latencies in ms):

w latencies
replica number 1
<latencies for replica 1 W in WARS, separated by newlines>
replica number 2
<latencies for replica 2 W in WARS, separated by newlines>
...
a latencies
<latencies for each replica's A in WARS, separated by newlines>
r latencies
<latencies for each replica's W in WARS, separated by newlines>
s latencies
<latencies for each replica's S in WARS, separated by newlines>
'''
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
        elif line.startswith("#") is True:
            # Skip comment lines
            continue
        else:
            curlatencies[curreplica].append(float(line))

    lats.append(curlatencies)

    return [LatencyModel(lat) for lat in lats]

#assume latencies are independently, identically distributed
def read_latencies_IID(f):
    lats = []
    for line in open(f):
        line = line.strip('\n')
        if line == "w latencies":
            curlatencies = []
        elif line == "a latencies" or line == "r latencies" or line == "s latencies":
            lats.append(curlatencies)
            curlatencies = []
        elif line.find("replica number") != -1:
            continue
        elif line.startswith("#") is True:
            # Skip comment lines
            continue
        else:
            curlatencies.append(float(line))

    lats.append(curlatencies)

    return [IIDLatencyModel(lat) for lat in lats]
        
