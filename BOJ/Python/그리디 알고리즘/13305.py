N = int(input())
railArr = list(map(int, input().split()))
priceArr = list(map(int, input().split()))
res = 0

now = float('inf')

for i in range(N-1):
    if priceArr[i] < now:
        now = priceArr[i]

    res += now * railArr[i]

print(res)
