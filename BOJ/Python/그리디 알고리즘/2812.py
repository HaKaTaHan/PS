N, K = map(int, input().split())
arr = list(input())
temp = list()
count = K

for i in range(N):
    while count > 0 and temp and temp[-1] < arr[i]:
        temp.pop()
        count -= 1
    temp.append(arr[i])

print(''.join(temp[:N-K]))

