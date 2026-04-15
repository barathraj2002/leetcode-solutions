# Last updated: 4/16/2026, 5:24:08 AM
1# Definition for a binary tree node.
2# class TreeNode:
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution:
8    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
9        if root is None:
10            return []
11        q = deque()
12        q.append(root)
13        outerList = []
14        while q:
15            temp_list = []
16            for _ in range(len(q)):
17                node = q.popleft()
18                if node.left: q.append(node.left)
19                if node.right: q.append(node.right)
20                temp_list.append(node.val)
21            outerList.append(temp_list)
22
23        return outerList