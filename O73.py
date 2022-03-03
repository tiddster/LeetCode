from math import ceil

class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        def isFinish(speed) -> bool:
            tempH = 0
            for i in range(len(piles)):
                tempH += ceil(piles[i] / speed)
                if tempH > h:
                    return False
            return True

        left, right = 1, max(piles)
        while not left == right:
            mid = (left + right) // 2
            if isFinish(mid):
                right = mid
            else:
                left = mid+1
        return left

