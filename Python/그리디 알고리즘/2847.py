N = int(input())
arr = list()
res = 0

for _ in range(N):
    arr.append(int(input()))

for i in range(N-2, -1, -1):
    if arr[i] >= arr[i+1]:
        temp = arr[i] - arr[i+1] + 1
        res += temp
        arr[i] -= temp

print(res)