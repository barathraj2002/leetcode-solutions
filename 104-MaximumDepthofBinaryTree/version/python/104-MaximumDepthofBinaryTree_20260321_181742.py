# Last updated: 3/21/2026, 6:17:42 PM
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7# 
8
9class Solution:
10    def maxDepth(self, root: Optional[TreeNode]) -> int:
11        if not root:
12            return 0 
13        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
14        