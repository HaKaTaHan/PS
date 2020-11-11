N, L = map(int, input().split())
arr = list(map(int, input().split()))
res = 0
L -= 1
arr.sort()
while arr:
    punk = arr.pop(0)
    temp = list()
    
    for i in range(len(arr)):
        if arr[i] - punk <= L:
            temp.append(i)

    for i in range(len(temp)):
        arr.pop(0)

    res += 1

print(res)