class Solution(object):
    def eraseOverlapIntervals(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: int
        """
        newList = sorted(intervals, key=lambda x:x[1])
        x_end = newList[0][1]
        cnt = 1
        for interval in newList:
            start = interval[0]
            if start >= x_end:
                cnt += 1
                x_end = interval[1]
        return cnt
