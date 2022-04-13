class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        fstBuy,fstSell,sndBuy,sndSell = -9999, 0, -9999, 0
        for p in prices:
            fstBuy = max(fstBuy, -p)
            fstSell = max(fstSell, fstBuy + p)
            sndBuy = max(sndBuy, fstSell-p)
            sndSell = max(sndSell, sndBuy + p)
        return sndSell