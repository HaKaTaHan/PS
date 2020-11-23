N = int(input())
arr = sorted(list(map(int, input().split())))
res = 1

for i in arr:
    if res < i:
        break
    res += i

print(res)
