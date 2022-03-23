class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        resL, resR = 0, 0
        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = left + (right - left) // 2
            if nums[mid] > target:
                right = mid - 1
            elif nums[mid] < target:
                left = mid + 1
            elif nums[mid] == target:
                right = mid - 1
            print(mid, [left, right])
        if left >= len(nums) or nums[left] != target:
            return [-1,-1]
        resL = left

        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = left + (right - left) // 2
            if nums[mid] > target:
                right = mid - 1
            elif nums[mid] < target:
                left = mid + 1
            elif nums[mid] == target:
                left = mid + 1
            print(mid, [left, right])
        if right<0 or nums[right] != target:
            return [-1,-1]
        resR = right
        return [resL, resR]

if __name__ == '__main__':
    arr = [2,2]
    s = Solution()
    print(s.searchRange(arr, 2))