S = input()
zeroDivide = len(list(filter(lambda x: len(x) > 0, S.split('0'))))
oneDivide = len(list(filter(lambda x: len(x) > 0, S.split('1'))))

print(min(zeroDivide, oneDivide))