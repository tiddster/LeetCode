class Solution(object):
    def missingTwo(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        nums = sorted(nums)
        if nums[0] == 3:
            return [1,2]
        res = []
        for i in range(len(nums)):
            if i == 0:
                if nums[0] != 1:
                    res.append(1)
            elif nums[i-1]+1 != nums[i]:
                res.append(nums[i-1]+1)

        if len(res) == 0:
            return  [nums[-1]+1, nums[-1]+2]
        elif len(res) == 1:
            return [res[0], nums[-1]+1]
        else:
            return res