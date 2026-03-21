# Last updated: 3/21/2026, 5:52:26 PM
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7# 
8#          2         1
9#         / \   
10#        1   3       1
11#       /    / \ 
12#      0       4      1
13#             /  \
14#                 5      1
15#                  \
16#                   6     1
17# 
18#  
19# 
20# 
21class Solution:
22    def maxDepth(self, root: Optional[TreeNode]) -> int:
23        
24        if not root:
25            return 0
26        count = 0
27        q = deque()
28        q.append(root) 
29
30        while q:
31            for _ in range(len(q)):                
32                temp = q.popleft()
33                if temp.left:
34                    q.append(temp.left)
35                if temp.right:
36                    q.append(temp.right)
37            count+=1
38    
39        return count
40        
41