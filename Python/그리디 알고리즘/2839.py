N = int(input())
arr = list()

for i in range((N//5)+1):
    if (N-5*i) % 3 == 0:
        arr.append(i+(N-5*i) // 3)

if len(arr) == 0:
    print(-1)
else:
    print(min(arr))