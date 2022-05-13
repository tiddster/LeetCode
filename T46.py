class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []

        def traceback(nums, tmp):
            if not nums:
                res.append(tmp)
                return
            for i in range(len(nums)):
                traceback(nums[:i] + nums[i + 1:], tmp + [nums[i]])

        traceback(nums, [])
        return res
