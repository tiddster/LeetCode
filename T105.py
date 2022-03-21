class TreeNode(object):
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right


class Solution(object):
    def buildTree(self, preorder, inorder):
        """
        :type preorder: List[int]
        :type inorder: List[int]
        :rtype: TreeNode
        """
        if not (preorder and inorder):
            return
        root = TreeNode(preorder[0])
        inId = inorder.index(preorder[0])
        leftSonInOrder = inorder[:inId]
        rightSonInOrder = inorder[inId+1:]
        leftSonPreOrder = preorder[1:inId+1]
        rightSonPreOrder = preorder[inId+1:]
        root.left = self.buildTree(leftSonPreOrder, leftSonInOrder)
        root.right = self.buildTree(rightSonPreOrder, rightSonInOrder)
        return root
