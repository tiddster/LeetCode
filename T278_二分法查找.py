class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        cnt = 0
        l, r = 0, len(nums)-1
        while l <= r:
            mid = (l+r)//2
            for i in nums:
                if i <= mid:
                    cnt += 1
            if cnt > mid:
                r = mid-1
            elif cnt <= mid:
                l = mid+1
        return r