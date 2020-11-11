count = 1
while True:
    L, P, V = map(int, input().split())
    if L == 0 and P == 0 and V == 0:
        break

    res = 0

    while V > 0:
        if V > L:
            res += L
        else:
            res += V
        V -= P

    print("Case {0}: {1}".format(count, res))

    count += 1
