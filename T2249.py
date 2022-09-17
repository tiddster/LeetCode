"""
给你一个整数数组 nums 和一个整数 k 。你可以将 nums 划分成一个或多个 子序列 ，使 nums 中的每个元素都 恰好 出现在一个子序列中。

在满足每个子序列中最大值和最小值之间的差值最多为 k 的前提下，返回需要划分的 最少 子序列数目。

子序列 本质是一个序列，可以通过删除另一个序列中的某些元素（或者不删除）但不改变剩下元素的顺序得到。
"""

class Solution(object):
    def partitionArray(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """

        nums = sorted(nums)
        res = 1
        last = nums[0]
        for num in nums:
            if last - num > k:
                last = num
                res += 1
        return 1
