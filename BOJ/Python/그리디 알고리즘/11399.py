N = int(input())
arr = list(map(int, input().split()))
res = 0
arr.sort()

for i in range(N):
    for j in range(i+1):
        res += arr[j]

print(res)