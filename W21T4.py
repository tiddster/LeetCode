def main():
    start, end = map(int, input().split())
    q = int(input())
    qs = []
    for i in range(q):
        qs.append(list(map(int, input().split())))
    for query in qs:
        HorseWalking(start, end, query, 0)
    pass


def HorseWalking(start, end, target, step):
    if step > 10:
        return -1

    nextLoc = [[start+move[0], end+move[1]] for move in moves]
    if target in nextLoc:
        res.append(step+1)
        return
    for loc in nextLoc:
        if 0<=loc[0]<=n+1 and 0<=loc[1]<=n+1:
            HorseWalking(loc[0], loc[1], target, step+1)

if __name__ == '__main__':
    moves = [[2,1], [2,-1], [-2, 1], [-2, -1], [1, 2], [1, -2], [-1, 2], [-1, -2]]
    n = int(input())
    res = []
    print(res)
    main()