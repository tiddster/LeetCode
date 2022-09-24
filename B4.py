num = int(input())

p = [0] * num
p[:] = map(int,input().split())
p = sorted(p)

res = [0] * num
i, j = 0, len(p)-1
idx = 0
while i < j:
    res[idx], res[idx+1] = p[i], p[j]
    idx += 2
    i += 1
    j -= 1

if num % 2 != 0:
    res[-1] = p[i]

ans = 0
for idx in range(len(res)-1):
    ans += abs(res[idx] - res[idx+1])
    print(ans)

ans += abs(res[0] - res[-1])
print(ans)