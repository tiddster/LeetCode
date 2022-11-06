def main():
    hour, mins = map(int, input().split())
    x = get_x_from_9(hour, mins)
    m, k, q, p = map(int, input().split())
    M1 = q/p*(m+k*x) * 0.75
    M2 = q/p*m
    M = min(M1, M2)
    print("%.4f" % M)
    pass


def get_x_from_9(hour, mins):
    if hour >= 21:
        return 0
    else:
        H = 21-hour-1
        M = 60 - mins
        return H * 60 + M


if __name__ == '__main__':
    main();