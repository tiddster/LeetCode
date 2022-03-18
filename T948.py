class Solution(object):
    def bagOfTokensScore(self, tokens, power):
        """
        :type tokens: List[int]
        :type power: int
        :rtype: int
        """
        tokens = sorted(tokens)
        hasP = 0
        maxP = 0
        i, j = 0, len(tokens) - 1
        while i <= j:
            if power < tokens[i] and j == len(tokens) - 1 and i == 0:
                return 0
            if power >= tokens[i]:
                power -= tokens[i]
                hasP += 1
                maxP = max(maxP, hasP)
                i += 1
            elif power < tokens[i] and hasP >= 1:
                power += tokens[j]
                hasP -= 1
                j -= 1
        return maxP
