class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        MAX, MIN = -1, nums[0]
        for num in nums[1:]:
            if num > MIN:
                ans = max(num-min, MAX)
            else:
                MIN = num
        return MAX