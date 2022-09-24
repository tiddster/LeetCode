from functools import lru_cache

a, b, C, D = map(int, input().split())
mem = {}

@lru_cache(10000)
def func(a, b):
    if a == 1:
        res = C*b + D
        return res
    elif a >= 2:
        return func(a - 1, func(a - 1, b))


print(func(a, b) % 10)
print(mem)
