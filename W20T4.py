def main():
    n = int(input())
    hl = map(int, input().split())
    ans, mx = 10, 0
    for x in hl:
        ans = max(ans, 10 * (mx / 10000) * (10000 / x))
        mx = max(mx,x)
    print("%.2f" % ans)
    pass


if __name__ == '__main__':
    main()