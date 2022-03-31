class Solution(object):
    def jump(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            return 0

        nowReach, nextReach = 0, nums[0]
        cnt = 0
        for i in range(len(nums)):
            nextReach = max(i + nums[i], nextReach)

            if nextReach >= len(nums) - 1:
                cnt += 1
                break

            if i == nowReach:
                nowReach = nextReach
                cnt += 1
        return cnt

if __name__ == '__main__':
    nums = [2,3,1,1,4]
    sol = Solution()
    print(sol.jump(nums))
