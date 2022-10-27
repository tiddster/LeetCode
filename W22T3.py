def main():
    n = int(input())
    nums = list(map(int, input().split()))
    print(nums)
    res = 0
    for i in range(n):
        for j in range(i, n):
            res += sgn(nums[i]-nums[j]) * abs(i-j)
    pass


def sgn(x):
    if x > 0:
        return 1
    elif x == 0:
        return 0
    else:
        return -1


if __name__ == '__main__':
    main();