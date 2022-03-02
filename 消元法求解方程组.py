import numpy as np

"""
原方程组为:
8*x1 + x2 - 2*x3 = 9
3*x1 - 10 * x2 + x3 = 19
5*x1 -2*x2 + 20*x3 = 72
"""

# 消元法两步思想：消元与回代
matrix = np.array([[0, 1, 1, 2],
                   [4, 5, 5, 5],
                   [5, 6, 7, 8]], dtype=np.float64)
row = len(matrix)
column = len(matrix[0])


# 交换两行/列
def swap(a, b):
    for i in range(0,len(a)):
        a[i], b[i] = b[i], a[i]


def GaussElimin(A, b):
    n = len(b)
    """
    n: b的长度
    mainE: 每次消元时最左上角的元素（未进行优化），也是回代时最右下角的元素
    subE: 消元/回代时主元素所对应列的元素
    eachE: 消元/回代时，主元素所对应行的元素
    所以 消元公式为: newE = oldE - eachE * subE/mainE
    回代公式: newE = oldE - eachE * subE/mainE
    所以回代公式和消元公式是同样的，只是顺序,方向不同而已
    """

    # 最左上角元素为0时，无法计算，所以交换为首元素不为0的行
    if A[0,0] == 0:
        for k in range(1,n):
            if A[k,0] != 0:
                swap(A[0,:], A[k,:])
                b[0], b[k] = b[k], b[0]
                break

    # 变为上三角矩阵->消元
    for k in range(0, n-1):
        mainE = A[k][k]
        for i in range(k+1, n):
            subE = A[i][k]
            if subE != 0:
                l = subE / mainE
                for j in range(k, n):
                    eachE = A[k][j]
                    A[i][j] -= l * eachE
                b[i] -= b[k] * l

    print(f"消元结果为{A, b}")

    # 回代
    count = 0  # 回代正向次数
    for k in range(n-1, -1, -1):
        count += 1
        mainE = A[k][k]
        for i in range(k-1, -1, -1):
            subE = A[i][k]
            if subE != 0:
                l = subE / mainE
                for j in range(k, n-count-1, -1):  # 因为在n-count-1之后全是0, 所以没有遍历的必要了
                    eachE = A[k][j]
                    A[i][j] -= l*eachE
                b[i] -= b[k] * l

    print(f"回代结果为{A, b}")

def Calculate_Final_Answer(A, b):
    res = []
    for i in range(0, len(b)):
        res.append(b[i]/A[i,i])
    return res

A = matrix[:,:column-1]
print(A)
b = []
for i in range(0,row):
    b.append(matrix[i, column-1])

GaussElimin(A, b)
print(f"最终答案为：{Calculate_Final_Answer(A,b)}")


