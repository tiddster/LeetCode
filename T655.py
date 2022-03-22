class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution(object):
    def printTree(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[str]]
        """
        self.maxHeight = 0
        self.getMaxHeight(root, 0)
        self.res = [["" for i in range(2 ** (self.maxHeight + 1) - 1)] for j in range(self.maxHeight + 1)]
        self.DFS(root, 0, 2 ** self.maxHeight - 1)

        return self.res

    def DFS(self, root, height, lastIndex):
        if root is None:
            return
        self.res[height][lastIndex] += str(root.val)
        if root.left is not None:
            nowIndex = lastIndex - 2 ** (self.maxHeight - height - 1)
            self.DFS(root.left, height + 1, nowIndex)
        if root.right is not None:
            nowIndex = lastIndex + 2 ** (self.maxHeight - height - 1)
            self.DFS(root.right, height + 1, nowIndex)

    def getMaxHeight(self, root, height):
        if root is None:
            return
        self.maxHeight = max(self.maxHeight, height)
        self.getMaxHeight(root.left, height + 1)
        self.getMaxHeight(root.right, height + 1)