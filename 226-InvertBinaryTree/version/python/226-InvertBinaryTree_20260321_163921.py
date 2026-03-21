# Last updated: 3/21/2026, 4:39:21 PM
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution:
8    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
9        if root == None:
10            return None
11        q = deque()
12        q.append(root)
13
14        while q:
15            temp = q.popleft()
16
17            if(temp.left != None or temp.right != None):
18                change_node = temp.left
19                temp.left = temp.right
20                temp.right = change_node
21            
22            if temp.left != None:
23                q.append(temp.left)
24            if temp.right != None:
25                q.append(temp.right)
26        
27        return root
28