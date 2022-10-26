class Solution:
    def spiralOrder(self, matrix):
        def circle(Lmin, Lmax, Hmin, Hmax):
            if Lmin > Lmax or Hmin > Hmax:
                return []
            elif Lmin == Lmax:
                return matrix[Lmin][Hmin:Hmax + 1]
            elif Hmin == Hmax:
                res = []
                for x in range(Lmin, Lmax + 1):
                    res.append(matrix[x][Hmin])
                return res
            else:
                res = []
                res.extend(matrix[Lmin][Hmin:Hmax + 1])
                for x in range(Lmin + 1, Lmax):
                    res.append(matrix[x][Hmax])
                res.extend(reversed(matrix[Lmax][Hmin:Hmax + 1]))
                for x in range(Lmax - 1, Lmin, -1):
                    res.append(matrix[x][Hmin])
                return res + circle(Lmin + 1, Lmax - 1, Hmin + 1, Hmax - 1)

        return circle(0, len(matrix) - 1, 0, len(matrix[0]) - 1)

s = Solution()
print(s.spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12]]))

