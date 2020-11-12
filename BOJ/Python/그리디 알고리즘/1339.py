from collections import defaultdict

N = int(input())
alpha = defaultdict(int)
r = [x for x in range(10)]

for _ in range(N):
    s = input()
    l = len(s) - 1

    for i in range(len(s)):
        alpha[s[i]] += 10 ** (l-i)

items = sorted(alpha.items(), key=lambda x: x[1], reverse=True)

for a, v in items:
    alpha[a] *= r.pop()

print(sum(alpha.values()))