N = int(input())
arr = list(map(int, input().split()))
res = [0 for x in range(N)]

for i in range(1, N+1):
    temp = arr[i-1]
    count = 0

    for j in range(N):
        if count == temp and res[j] == 0:
            res[j] = i
            break
        if res[j] == 0:
            count += 1

for i in res:
    print(i, end=' ')