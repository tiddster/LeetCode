max_n, max_m = map(int, input().split())
start_n, start_m = map(int, input().split())

num_ob = int(input())
obs = []
for i in range(num_ob):
    ob_n, ob_m = map(int, input().split())
    obs.append((ob_n, ob_m))

directions = input()

def outofbounds():
    if start_n <= 0 or start_n >= max_n or start_m <= 0 or start_m >= max_m:
        return True
    return False

for s in directions:
    if s == 'L':
        while True:
            if (start_n, start_m) in obs:
                start_m += 1
                break
            start_m -= 1
            if start_m == 1 or start_m == 5:
                break
    elif s == 'R':
        while True:
            if (start_n, start_m) in obs:
                start_m -= 1
                break
            start_m += 1
            if start_m == 1 or start_m == 5:
                break
    elif s == 'U':
        while True:
            if (start_n, start_m) in obs:
                start_n += 1
                break
            start_n -= 1
            if start_n == 1 or start_n == 5:
                break
    elif s == 'D':
        while True:
            if (start_n, start_m) in obs:
                start_n -= 1
                break
            start_n += 1
            if start_n == 1 or start_n == 5:
                break
    print(start_n, start_m)

print(start_n, start_m)