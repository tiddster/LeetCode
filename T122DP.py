class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        dp = [0] * len(prices)
        lastBuy, minVal, dp[0] = prices[0],prices[0],0
        for index, price in enumerate(prices[1:]):
            print(price,lastBuy,minVal)
            if price <= minVal:
                lastBuy = minVal = price
                dp[index+1] = dp[index]
            elif price <= lastBuy:
                lastBuy = price
                dp[index+1] = dp[index]
            else:
                dp[index+1] = max(price - lastBuy + dp[index], dp[index+1]-minVal)
                lastBuy = price
            print(dp)
        return dp[len(prices)-1]