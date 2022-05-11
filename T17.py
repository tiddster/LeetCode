class Solution(object):
    phoneMap = {
        "2": "abc",
        "3": "def",
        "4": "ghi",
        "5": "jkl",
        "6": "mno",
        "7": "pqrs",
        "8": "tuv",
        "9": "wxyz",
    }

    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        res = []

        if len(digits) == 0:
            return []

        if len(digits) == 1:
            for c in self.phoneMap[digits[0]]:
                res.append(c)
            return res

        self.trackBack(0, digits, "", res)
        return res

    def trackBack(self, l, digits, strRes, res):
        if l == len(digits):
            res.append(strRes)
            return

        for c in self.phoneMap[digits[l]]:
            strRes += c
            tempStr = strRes
            self.trackBack(l + 1, digits, tempStr, res)
            strRes = strRes[:-1]

sol = Solution()
print(sol.letterCombinations("23"))