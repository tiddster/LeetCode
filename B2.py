tmp, ans = 0, 0

s = []
n = int(input())
for i in range(n):
    s_h = input()
    s.append(s_h)

for i in range(n):
    tmp = 0
    for j in range(n):
        if s[i] == s[j]:
            tmp += 1
    if tmp > ans: ans = tmp

print(ans)