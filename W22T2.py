
def main():
    x, y, m, n, l = map(int, input().split())
    k, c = 1, 1
    while True:
        dis = (m-n)*k - c*l
        if dis < x - y:
            k += 1
        elif dis == x - y:
            break
        elif (m-n)*k - c*l  > x-y:
            c += 1
        print(k)
    pass


if __name__ == '__main__':
    main();