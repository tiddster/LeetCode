class Solution(object):
    def candy(self, ratings):
        """
        :type ratings: List[int]
        :rtype: int
        """
        m = len(ratings)
        res = [1] * m
        for i in range(0, m):
            if i > 0 and ratings[i] > ratings[i - 1]:
                res[i] = res[i - 1] + 1
        for i in range(m - 1, -1, -1):
            if i < m - 1 and ratings[i] > ratings[i + 1]:
                res[i] = max(res[i], res[i + 1] + 1)
        return sum(res)
