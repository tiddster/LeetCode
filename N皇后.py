import numpy as np

res = []
def NQueen(broad, row):
    if row == len(broad):
        res.append(broad)
        return

    n = len(broad[row])
    for col in range(n):
        if not isValid(broad, row, col):
            continue
        broad[row][col] = 1
        NQueen(broad.copy(), row + 1)
        broad[row][col] = 0


def isValid(broad, row, col):
    for i in range(row):
        #检查列
        if broad[i][col] == 1:
            return False
        if row-i-1>=0 and col-i-1>=0 and broad[row-i-1][col-i-1] == 1:
            return False
        if row-i-1>=0 and col+i+1<=len(broad)-1 and broad[row-i-1][col+1+i] == 1:
            return False
    return True

broad = np.zeros((8,8))
NQueen(broad, 0)
for r in res:
    print(r)