class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        s = str(n)
        res = 0
        seen = []
        while True:
            res = 0
            for c in s:
                i = int(c) ** 2
                res += i
            if res == 1:
                return True
            elif res in seen or res > 9999999:
                return False
            seen.append(res)