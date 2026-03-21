# Last updated: 3/21/2026, 9:45:33 PM
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution:
8    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
9        if not root:
10            return False
11        if not subRoot:
12            return False
13        if not root:
14            return False
15        if subRoot.val == root.val and self.isSameTree(root, subRoot):
16            return True
17
18        return self.isSubtree(root.left,subRoot) or self.isSubtree(root.right, subRoot)
19
20
21    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
22        if not p and not q:
23            return True
24        if (p and not q) or (q and not p) or p.val != q.val:
25            return False
26        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)