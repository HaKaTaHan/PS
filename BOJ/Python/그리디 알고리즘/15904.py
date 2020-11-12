S = input()
UCPC = "UCPC"
idx = 0
for i in UCPC:
    temp = S.find(i, idx)
    if temp == -1:
        print("I hate UCPC")
        break
    idx = temp
else:
    print("I love UCPC")
