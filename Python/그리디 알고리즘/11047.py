N, K = map(int, input().split())
arr = list()
res = 0

for _ in range(N):
    arr.append(int(input()))

for i in reversed(arr):
    if i > K:
        continue

    if K == 0:
        break

    res += K // i
    K -= (K // i) * i

print(res)