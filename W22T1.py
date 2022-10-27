def main():
    for i in range(m):
        info = input()
        if info == 'R':
            Repaier(lastDestroy.pop())
        else:
            info, houseIdx = info.split()
            if info == 'D':
                Destroy(int(houseIdx))
                lastDestroy.append(int(houseIdx))
            elif info == 'Q':
                soldier(int(houseIdx))
    pass


def Destroy(idx):
    trueIdx = idx - 1
    houses[trueIdx] = 0


def Repaier(idx):
    trueIdx = idx - 1
    houses[trueIdx] = 1


def soldier(idx):
    trueIdx = idx - 1
    res = 0
    i, j = trueIdx, trueIdx
    while i >= 0:
        if houses[i] == 0:
            break
        res += 1
        i -= 1
    while j <= len(houses)-1:
        if houses[j] == 0:
            break
        res += 1
        j += 1
    print(res-1 if res != 0 else 0)


if __name__ == '__main__':
    n, m = map(int, input().split())
    houses = [1 for i in range(n)]
    lastDestroy = []
    # houses = [1, 0, 1, 0, 1]
    # soldier(3)
    main();