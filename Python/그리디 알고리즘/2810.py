from collections import Counter

N = int(input())
S = input()
dictSeat = Counter(S)

holders = dictSeat['S'] + (dictSeat['L'] // 2) + 1

print(min(holders, sum(dictSeat.values())))