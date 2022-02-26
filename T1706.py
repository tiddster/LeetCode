class Solution:
    def findBall(self, grid: List[List[int]]) -> List[int]:
        m, n = len(grid), len(grid[0])
        ans = [-1] * n
        for i in range(n):
            x, y = 0, i
            while x < m and 0 <= y < n:
                if y > 0 and grid[x][y] == grid[x][y - 1] == -1:
                    x += 1
                    y -= 1
                elif y < n - 1 and grid[x][y] == grid[x][y + 1] == 1:
                    x += 1
                    y += 1
                else:
                    break
            if x == m:
                ans[i] = y
        return ans