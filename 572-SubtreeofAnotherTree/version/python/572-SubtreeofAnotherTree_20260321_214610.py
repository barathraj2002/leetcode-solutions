# Last updated: 3/21/2026, 9:46:10 PM
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution:
8    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
9        if not root or not subRoot:
10            return False
11        if subRoot.val == root.val and self.isSameTree(root, subRoot):
12            return True
13
14        return self.isSubtree(root.left,subRoot) or self.isSubtree(root.right, subRoot)
15
16
17    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
18        if not p and not q:
19            return True
20        if (p and not q) or (q and not p) or p.val != q.val:
21            return False
22        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)