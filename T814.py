class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution(object):
    def pruneTree(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: Optional[TreeNode]
        """
        if not root:
            return None

        left = self.pruneTree(root.left)
        right = self.pruneTree(root.right)
        print(root)
        if left is None and right is None and root.val == 0:
            root = None
        return root
