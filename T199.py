class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution(object):
    def rightSideView(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        res = []

        def DFS(root, depth):
            if root is None:
                return
            if depth == len(res):
                res.append(root.val)
            DFS(root.right, depth + 1)
            DFS(root.left, depth + 1)

        return res

    def rightSideView2(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        """
        1. 定义队列，将头节点加入
        2. 当队列不为空:
            2.1 定义下一层的节点列表 nextLayer
            2.2 遍历队列中的所有节点:
                2.2.1 左节点不为空则加入nextLayer
                2.2.2 右节点不为空则加入nextLayer
                2.2.3 其他操作
            2.3 将队列迭代成nextLayer
        """
        res = []

        if root is None:
            return res

        def BFS(root):
            Queue = [root]
            while Queue:
                n = len(Queue)
                #res.append(Queue[-1].val)
                nextLayer = []
                for node in Queue:
                    if node.left is not None:
                        nextLayer.append(node.left)
                    if node.right is not None:
                        nextLayer.append(node.right)
                    print(node.val)
                    #BFS中要执行的特殊操作
                    #print..
                Queue = nextLayer
        BFS(root)
        return res
