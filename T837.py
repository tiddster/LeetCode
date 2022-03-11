def new21Game(self, n, k, maxPts):
    """
    :type n: int
    :type k: int
    :type maxPts: int
    :rtype: float
    """
    if k == 0:
        return 1.0

    dp = [0]*(k+maxPts)
    for i in range(k, min(n,k+maxPts-1)+1):
        dp[i] = 1.0
    for i in range(k-1,-1,-1):
        for j in range(1, maxPts+1):
            dp[i] += dp[i+j]/maxPts
    return dp[0]
