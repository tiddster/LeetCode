def main():
    A = input()
    B = input()
    ans = 0
    for i in range(len(A)):
        if A[i] == '1' and B[i] == '0':
            ans += 1
        elif A[i] == '0' and B[i] == '1':
            print(0)
            pass
    print(2 ** ans)


if __name__ == '__main__':
    main();