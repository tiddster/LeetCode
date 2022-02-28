class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        if len(grid) == 0 or len(grid[0]) == 0 or grid is None:
            return 0

        row, line = len(grid), len(grid[0])
        dp = [[0 for i in range(line)] for j in range(row)]
        dp[0][0] = grid[0][0]

        for i in range(1, row):
            dp[0][i] = dp[0][i-1]+grid[0][i]
        for j in range(1, line):
            dp[j][0] = dp[j-1][0]+grid[j][0]

        for i in range(1, row):
            for j in range(1, line):
                preMin = min(dp[i][j-1], dp[i-1][j])
                dp[i][j] = preMin + grid[i][j]

        return dp[row-1][line-1]


