# Last updated: 3/21/2026, 9:52:51 PM
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if not subRoot:
            return True
        if not root:
            return False        
        tree1 = self.getTreeString(root)
        tree2 = self.getTreeString(subRoot)
        return tree2 in tree1

    def getTreeString(self, root: Optional[TreeNode]) -> str:
        treeString = []
        def dfs(node):
            if node:
                treeString.append(','+str(node.val))
                dfs(node.left)
                dfs(node.right)
            else:
                treeString.append(',#')
        dfs(root)
        return ''.join(treeString)
        



                

















        # if not subRoot:
        #     return True
        # if not root:
        #     return False

        # def isSameTree(root1, root2):
        #     if not root1 and not root2:
        #         return True
        #     if (root1 and not root2) or (not root1 and root2):
        #         return False
        #     return root1.val == root2.val and isSameTree (root1.left, root2.left) and isSameTree(root1.right, root2.right)

        # que = collections.deque([root])
        # while que:
        #     node = que.popleft()
        #     if isSameTree(node, subRoot):
        #         return True
        #     if node.left:
        #         que.append(node.left)
        #     if node.right:
        #         que.append(node.right)
        # return False

        