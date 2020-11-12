S = input()
S = S.split('-')
res = 0
temp = S[0].split('+')
for j in temp:
    res += int(j)

if len(S) > 1:
    for i in range(1, len(S)):
        temp = S[i].split('+')
        for j in temp:
            res -= int(j)

print(res)
    

