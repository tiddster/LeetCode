"""
给你一个字符串 s ，请你判断它是否 有效 。
字符串 s 有效 需要满足：假设开始有一个空字符串 t = "" ，你可以执行 任意次 下述操作将 t 转换为 s ：

将字符串 "abc" 插入到 t 中的任意位置。形式上，t 变为 tleft + "abc" + tright，其中 t == tleft + tright 。注意，tleft 和 tright 可能为 空 。
如果字符串 s 有效，则返回 true；否则，返回 false。
"""


class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """

        stack = []
        for i, c in enumerate(s):
            if c == 'c':
                if len(stack) == 0: return False
                else: bChar= stack.pop()
                if len(stack) == 0:return False
                else: aChar = stack.pop()
                if aChar != 'a' or bChar != 'b': return False
            else:
                stack.append(c)

        return True if len(stack) == 0 else False

