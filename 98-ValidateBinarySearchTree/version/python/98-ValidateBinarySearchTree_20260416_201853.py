# Last updated: 4/16/2026, 8:18:53 PM
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution:
8        def isValidBST(self, root: Optional[TreeNode]):
9            def validateLeft(node , max, min):
10                if not node:
11                    return True
12                if not (min < node.val < max):
13                    return False
14                return validateLeft(node.left, node.val , min) and validateLeft(node.right, max, node.val)
15
16            return validateLeft(root, float('inf'), float('-inf'))