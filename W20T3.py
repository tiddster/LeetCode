def main():
    minsA, lenA = 0, 0

    while True:
        try:
            data = input().split()

            length = int(data[0])
            mins = int(data[1].split(":")[0]) * 60 + int(data[1].split(":")[1])

            minsA += mins
            lenA += length
        except EOFError:
            break

    res = minsA * 1000 / lenA
    print("%d%d:%d%d" % (res//600, res//60%10, res%60//10, res%10))
    pass


if __name__ == '__main__':
    main()