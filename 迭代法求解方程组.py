"""
原方程组为:
8*x1 + x2 - 2*x3 = 9
3*x1 - 10 * x2 + x3 = 19
5*x1 -2*x2 + 20*x3 = 72
"""


def Jacobi(x1, x2, x3, count=1):
    # Jacobi迭代格式
    y1 = (-1 / 8) * x2 + 1 / 4 * x3 + 9 / 8
    y2 = 3 / 10 * x1 + 1 / 10 * x3 - 19 / 10
    y3 = (-1 / 4) * x1 + 1 / 10 * x2 + 3.6

    # 如果 yk 与 xk 中的每个元素相差的绝对值小于0.00001，迭代结束
    if abs(y1 - x1) < 0.00001 and abs(y2 - x2) < 0.00001 and abs(y3 - x3) < 0.00001:
        print(f"Jacobi最终的计算结果为{y1},{y2},{y3}")
    else:
        print(f"Jacobi第{count}次的迭代结果为{y1},{y2},{y3}")
        x1, x2, x3, count = y1, y2, y3, count + 1
        return Jacobi(x1, x2, x3, count)


Jacobi(0, 0, 0)


def Seidel(x1, x2, x3, count=1):
    # Seidel迭代法格式
    y1 = (-1 / 8) * x2 + 1 / 4 * x3 + 9 / 8
    y2 = 3 / 10 * y1 + 1 / 10 * x3 - 19 / 10
    y3 = (-1 / 4) * y1 + 1 / 10 * y2 + 3.6

    # 如果 yk 与 xk 中的每个元素相差的绝对值小于0.00001，迭代结束
    if abs(y1 - x1) < 0.00001 and abs(y2 - x2) < 0.00001 and abs(y3 - x3) < 0.00001:
        print(f"Seidel最终的计算结果为{y1},{y2},{y3}")
    else:
        print(f"Seidel第{count}次的迭代结果为{y1},{y2},{y3}")
        x1, x2, x3, count = y1, y2, y3, count + 1
        return Seidel(x1, x2, x3, count)


Seidel(0, 0, 0)


def Sor(x1, x2, x3, w, count=1):
    # SOR迭代个数, w为松弛因子
    y1 = (1-w)*x1 + w*((-1 / 8) * x2 + 1 / 4 * x3 + 9 / 8)
    y2 = (1-w)*x2 + w*(3 / 10 * y1 + 1 / 10 * x3 - 19 / 10)
    y3 = (1-w)*x3 + w*((-1 / 4) * y1 + 1 / 10 * y2 + 3.6)

    # 如果 yk 与 xk 中的每个元素相差的绝对值小于0.00001，迭代结束
    if abs(y1 - x1) < 0.00001 and abs(y2 - x2) < 0.00001 and abs(y3 - x3) < 0.00001:
        print(f"SOR最终的计算结果为{y1},{y2},{y3}")
    else:
        print(f"SOR第{count}次的迭代结果为{y1},{y2},{y3}")
        x1, x2, x3, count = y1, y2, y3, count + 1
        return Sor(x1, x2, x3, w, count)

Sor(0,0,0,0.95)