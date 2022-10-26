"""
给你一个整数数组 arr 和一个整数 k 。现需要从数组中恰好移除 k 个元素，请找出移除后数组中不同整数的最少数目。
"""

class Solution(object):
    def findLeastNumOfUniqueInts(self, arr, k):
        """
        :type arr: List[int]
        :type k: int
        :rtype: int
        """
        arrDict = {}
        for a in arr:
            if arrDict.get(a) is None:
                arrDict[a] = 1
            else:
                arrDict[a] += 1

        arrDictValues = sorted(arrDict.values())
        res = len(arrDictValues)

        for v in arrDictValues:
            if k > 0:
                k -= v
                res -= 1
            if k < 0:
                return res + 1
        return 0

s = Solution()
print(s.findLeastNumOfUniqueInts([1,3,2,3,3,2], 2))