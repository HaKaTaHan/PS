from heapq import *
import sys
input = sys.stdin.readline
N, K = map(int, input().split())
res = 0
heap = list()
jewelArr = list()
bagArr = list()

for _ in range(N):
    jewelArr.append(tuple(map(int, input().split())))
    
for _ in range(K):
    bagArr.append(int(input()))

bagArr.sort()
jewelArr.sort(key=lambda x: x[0], reverse=True)

for weight in bagArr:
    while jewelArr and weight >= jewelArr[-1][0]:
        heappush(heap, -jewelArr.pop()[1])
    if heap:
        res -= heappop(heap)

print(res)
