N = int(input())
arr = list()
res = 0

for _ in range(N):
    arr.append(int(input()))

arr.sort(reverse=True)

for count, rope in enumerate(arr):
    if rope * (count + 1) > res:
        res = rope * (count + 1)

print(res)