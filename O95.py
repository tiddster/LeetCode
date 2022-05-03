class Solution(object):
    def longestCommonSubsequence(self, text1, text2):
        """
        :type text1: str
        :type text2: str
        :rtype: int
        """

        dp = [[0 for i in range(len(text1) + 1)] for j in range(len(text2) + 1)]

        for j in range(1, len(text2) + 1):
            for i in range(1, len(text1) + 1):
                if text1[i-1] != text2[j-1]:
                    dp[j][i] = max(dp[j-1][i], dp[j][i-1])
                else:
                    dp[j][i] = dp[j-1][i-1] + 1
        for i in dp:
            print(i)
        return dp[len(text2)][len(text1)]

if __name__ == '__main__':
    text1 = "abcbdb"
    text2 = "acbbabdbb"
    sol = Solution()
    print(f"{text1}与{text2}的最长公共子序列为{sol.longestCommonSubsequence(text1, text2)}")