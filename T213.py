class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        m = len(nums)
        if m <= 3:
            return max(nums)
        dp1 = [0] * (m-1)
        dp2 = [0] * (m-1)
        dp1[0], dp1[1] = nums[0], nums[1]
        dp2[0], dp2[1] = nums[1], nums[2]
        for i in range(2,m-1):
            if i-3 >= 0:
                dp1[i] = nums[i] + max(dp1[i-2], dp1[i-3])
                dp2[i] = nums[i] + max(dp2[i - 2], dp2[i - 3])
            else:
                dp1[i] = nums[i] + dp1[i-2]
                dp2[i] = nums[i] + dp2[i - 2]
            print(dp1,dp2)
        return max(dp1[m-2],dp2[m-2],dp1[m-3],dp2[m-3])

    def rob2(self, nums):
        if len(nums) <= 3:
            return max(nums)

        def rob(nums):
            pre, cur = 0, 0
            for num in nums:
                cur, pre = max(pre + num, cur), cur
            return max(cur, pre)

        return max(rob(nums[1:]), rob(nums[:-1]))

if __name__ == "__main__":
    arr = [2,2,2,2,1,2,2]
    sol = Solution()
    print(sol.rob(arr))
