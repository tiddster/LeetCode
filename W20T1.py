import time


class node():
    def __init__(self, value, next=None):
        self.value = value
        self.next = next


def createNode(n):
    if n < 0:
        return 0
    if n == 1:
        return node(1)
    else:
        root = node(1)
        tem = root
        for i in range(2, n + 1):
            tem.next = node(i)
            tem = tem.next
            tem.next = root
        return root


def main(n, k):
    if k == 1:
        return n
    root = createNode(n)
    tem = root
    while True:
        for i in range(k-2):
            tem = tem.next
        tem.next = tem.next.next
        tem = tem.next
        if tem.next == tem:
            break
    print(tem.value)


if __name__ == '__main__':
    n, k = map(int, input().split())
    main(n, k)