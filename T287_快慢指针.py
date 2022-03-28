class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        slow, fast = 0, 0
        while True:
            print(f"1  {slow, fast}")
            slow = nums[slow]
            fast = nums[nums[fast]]
            if slow == fast:
                break
        i = 0
        while True:
            print(f"2  {slow, i}")
            slow = nums[slow]
            i = nums[i]
            if i == slow:
                break
        return slow

if __name__ == "__main__":
    sol = Solution()
    arr = [1,2,7,6,3,4,5,8,2]
    print(sol.findDuplicate(arr))