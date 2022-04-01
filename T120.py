class Solution():
    def minimumTotal(self, triangle):
        if len(triangle) == 1:
            return triangle[0][0]
        
        if len(triangle) == 2:
            return triangle[0][0] + min(triangle[1])
		
        minTri = [ [0 for i in range(len(triangle))] for j in range(len(triangle)) ]
        minTri[0][0] = triangle[0][0]
        for h in range(1,len(triangle)):
            for i in range(len(triangle[h])):
                if i == 0:
                    minTri[h][i] = minTri[h-1][i] + triangle[h][i]
                elif i == len(triangle[h])-1:
                    minTri[h][i] = minTri[h-1][i-1] + triangle[h][i]
                else:
                    minTri[h][i] = min(minTri[h-1][i-1], minTri[h-1][i]) + triangle[h][i]
        return min(minTri[len(triangle)-1])

if __name__ == '__main__':
    tri = [
        [2],
        [3,4],
        [6,5,7],
        [4,1,8,3]
    ]
    sol = Solution()
    print(sol.minimumTotal(tri))