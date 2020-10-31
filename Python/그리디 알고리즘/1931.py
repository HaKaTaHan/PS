N = int(input())
arr = list()
res = 0

for _ in range(N):
    arr.append(tuple(map(int, input().split())))

arr.sort(key=lambda x: (x[1], x[0]))

end = arr[0][1]
res += 1

for i in range(1, N):
    if arr[i][0] >= end:
        res += 1
        end = arr[i][1]

print(res)
