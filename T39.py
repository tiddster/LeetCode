class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        res = []
        self.traceback(candidates,target,[],res)
        return res

    def traceback(self, candidates, target, numList, res):
        if sum(numList) > target:
            return
        elif sum(numList) == target:
            numList = sorted(numList)
            for l in res:
                if l == numList:
                    return
            res.append(numList)
            return

        for c in candidates:
            if sum(numList) + c > target:
                continue
            numList.append(c)
            self.traceback(candidates, target, numList.copy(), res)
            numList = numList[:-1]

sol = Solution()
print(sol.combinationSum([2,3,5],8))
