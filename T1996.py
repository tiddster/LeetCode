class Solution(object):
    def numberOfWeakCharacters(self, properties):
        """
        :type properties: List[List[int]]
        :rtype: int
        """

        properties.sort(key=lambda x: (-x[0], x[1]))

        maxDef = 0
        res = 0
        for p in properties:
            if p[1] < maxDef:
                res += 1
            else:
                maxDef = p[1]
        return res


s = Solution()
p = [[7,9],[10,7],[6,9],[10,4],[7,5],[7,10]]
s.numberOfWeakCharacters(p)