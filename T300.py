class Solution(object):
    def lengthOfLIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums is None:
            return 0
        maxN, minN = nums[0], nums[0]
        dp = [1] * nums
        for i in range(1, len(nums)):
            pivot = nums[i]
            for j in range(i):
                if pivot <= nums[j]:
                    print()
                elif pivot > nums[j]:
                    dp[i] = max(dp[i], dp[j] + 1)
        return max(dp)
