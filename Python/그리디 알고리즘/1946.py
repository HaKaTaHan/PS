import sys
input = sys.stdin.readline
T = int(input())

for _ in range(T):
    N = int(input())
    arr = list()
    res = 1
    
    for i in range(N):
        arr.append(tuple(map(int,input().split())))
    arr.sort() #서류 성적 순으로 정렬 ==> 서류 성적 1등의 면접 성적보다 나머지 사람들의 면접 성적이 높지 않다면 제외
    
    m = arr[0][1]
    for i in range(1, N):
        if arr[i][1] < m:
            res += 1
            m = arr[i][1]

    print(res)