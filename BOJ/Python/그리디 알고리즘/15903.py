import heapq

n, m = map(int,input().split())
arr = list(map(int, input().split()))
heapq.heapify(arr)

for i in range(m):
    x = heapq.heappop(arr)
    y = heapq.heappop(arr)
    heapq.heappush(arr, x+y)
    heapq.heappush(arr, x+y)

print(sum(arr))
# n, m = map(int,input().split())
# arr = sorted(map(int,input().split()), reverse=True)

# for i in range(m):
#     x, y = arr.pop(), arr.pop()
#     arr.append(x+y)
#     arr.append(x+y)
#     arr.sort(reverse=True)

# print(sum)
