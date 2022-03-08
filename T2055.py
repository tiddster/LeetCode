class Solution(object):
    def platesBetweenCandles(self, s, queries):
        """
        :type s: str
        :type queries: List[List[int]]
        :rtype: List[int]
        """

        preSum, Sum = [0] * len(s), 0
        #先计算前缀和，也就是包括i位置之前有多少个盘子
        for i in range(len(s)):
            if s[i] == '*':
                Sum += 1
            preSum[i] = Sum

        # 预处理，将left数组中储存左侧最近蜡烛的下标值，无论访问哪一个元素，都可以快速找到左侧最近蜡烛的下标值
        left, temp = [0] * len(s), -1
        for i in range(len(s)):
            if s[i] == '|':
                temp = i
            left[i] = temp

        right, temp = [0] * len(s), -1
        for i in range(len(s)-1, -1, -1):
            if s[i] == '|':
                temp = i
            right[i] = temp

        res = [0] * len(queries)
        for i, (x, y) in enumerate(queries):
            x, y = right[x], left[y]
            if 0 <= x < y and y >= 0:
                res[i] = preSum[y] - preSum[x]

        return res



