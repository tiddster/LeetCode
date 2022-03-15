class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution(object):
    def isValidBST(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        list = []

        def dfs(root):
            if root:
                dfs(root.left)
                list.append(root.val)
                dfs(root.right)


        dfs(root)

        for i in range(1, len(list)):
            if list[i-1] >= list[i]:
                return False

        return True
