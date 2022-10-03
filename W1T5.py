
n = int(input())

a, b = map(int, input().split())

tower = [[1 for i in range(k)]for k in range(1, n+1)]

for k in range(2, n):
    for i in range(1, k):
        if (tower[k-1][i] == 1 and tower[k-1][i-1] == 1) or (tower[k-1][i] == 0 and tower[k-1][i-1] == 0):
            tower[k][i] = 0
            if a == k and b == i:
                print(tower[a][b])

