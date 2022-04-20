class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """

        l, r = 0, height[len(height) - 1]
        maxA = -9999
        while l < r:
            maxA = max(maxA, min(height[l], height[r]) * (r-l))
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return maxA
