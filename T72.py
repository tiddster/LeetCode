import numpy as np

class Solution(object):
    def minDistance(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: int
        """
        # i是列数， j是行数
        dp = [[0 for i in range(len(word1) + 1)] for j in range(len(word2) + 1)]
        for i in range(len(word1) + 1):
            dp[0][i] = i
        for j in range(len(word2) + 1):
            dp[j][0] = j
        print(dp)
        for i in range(1, len(word2) + 1):
            for j in range(1, len(word1) + 1):
                if word2[i - 1] != word1[j - 1]:
                    dp[i][j] = min(dp[i - 1][j], dp[i - 1][j - 1], dp[i][j - 1]) + 1
                if word2[i - 1] == word1[j - 1]:
                    dp[i][j] = dp[i - 1][j - 1]
        return dp[len(word2)][len(word1)]

if __name__ == "__main__":
    word1 = "horse"
    word2 = "ros"
    sol = Solution()
    print(sol.minDistance(word1,word2))