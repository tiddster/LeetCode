class Solution(object):
    def coinChange(self, coins, amount):
        """
        :type coins: List[int]
        :type amount: int
        :rtype: int
        """
        if amount == 0:
            return 0
        if len(coins) == 1 and coins[0] > amount:
            return -1

        dp = [0] * (amount + 1)
        for i in range(1, amount + 1):
            times = []
            for coin in coins:
                if (i - coin > 0 and dp[i - coin] != 0) or i - coin == 0:
                    times.append(dp[i - coin] + 1)
            dp[i] = min(times) if len(times) != 0 else 0
        return dp[amount] if dp[amount] != 0 else -1

if __name__ == '__main__':
    coins = [2,3,5]
    amount = 17
    sol = Solution()
    print(sol.coinChange(coins,amount))