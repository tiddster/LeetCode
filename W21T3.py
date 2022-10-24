def main():
    #code here
    res = []
    for i in range(1, 101):
        a = i
        while a != 1:
            if a % 2 == 1:
                a = a * 5 - 1
            else:
                a = a // 2
            if a > 10e7:
                break
        if a == 1:
            res.append(i)
    print(res)
    pass


if __name__ == '__main__':
    main()