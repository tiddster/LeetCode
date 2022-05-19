import math


class Solution(object):
    def minMoves2(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        n = len(nums)
        nums = sorted(nums)
        total = 0
        for num in nums:
            total += abs(num - nums[n//2])
        return total