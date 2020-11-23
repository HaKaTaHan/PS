N = int(input())
minusArr = list()
plusArr = list()
res = 0

for _ in range(N):
    num = int(input())
    if num <= 0:
        minusArr.append(num)
    else:
        plusArr.append(num)

minusArr.sort(reverse=True)
plusArr.sort()

for i in range(len(plusArr) // 2):
    a, b = plusArr.pop(), plusArr.pop()
    res += max(a*b, a+b)

for i in range(len(minusArr) // 2):
    a, b = minusArr.pop(), minusArr.pop()
    res += a*b

if minusArr:
    res += minusArr[0]
if plusArr:
    res += plusArr[0]

print(res)