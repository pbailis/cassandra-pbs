
from random import randint

class LatencyModel:
    def __init__(self, latencies):
        self.latencies = latencies

    def get_next_latency(self, retno):
        possibilities = self.latencies[retno]
        return possibilities[randint(0, len(possibilities)-1)]

class IIDLatencyModel:
    def __init__(self, latencies):
        self.latencies = latencies

    def get_next_latency(self, retno):
        return self.latencies[randint(0, len(self.latencies)-1)]
