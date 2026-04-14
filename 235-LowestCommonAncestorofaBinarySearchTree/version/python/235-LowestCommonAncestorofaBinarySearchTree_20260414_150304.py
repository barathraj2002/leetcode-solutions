# Last updated: 4/14/2026, 3:03:04 PM
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, x):
4#         self.val = x
5#         self.left = None
6#         self.right = None
7
8class Solution:
9    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
10        if root.val > p.val and root.val > q.val:
11            return self.lowestCommonAncestor(root.left, p, q)
12
13        elif min(p.val,q.val) < root.val and max(p.val,q.val) > root.val:
14            return root
15        
16        elif root.val < p.val and root.val < q.val:
17            return self.lowestCommonAncestor(root.right, p, q)
18
19        elif p.val == root.val:
20            return p
21
22        elif q.val == root.val:
23            return q
24        