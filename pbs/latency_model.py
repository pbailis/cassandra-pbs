
from random import randint

class LatencyModel:
    def __init__(self, latencies):
        self.latencies = latencies

    def get_next_latency(self, retno):
        possibilities = self.latencies[retno]
        return possibilities[randint(0, len(possibilities)-1)]
