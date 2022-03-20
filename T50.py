class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """

        if n == 0: return 1
        if n == 1: return x

        if n%2 == 1:
            return x*pow(x,n-1)
        else:
            return pow(x, n//2)*pow(x, n//2)