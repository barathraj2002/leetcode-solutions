# Last updated: 3/21/2026, 4:40:37 PM
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root == None:
            return None
        q = deque()
        q.append(root)

        while q:
            temp = q.popleft()

            if(temp.left != None or temp.right != None):
                change_node = temp.left
                temp.left = temp.right
                temp.right = change_node
            
            if temp.left != None:
                q.append(temp.left)
            if temp.right != None:
                q.append(temp.right)
        
        return root
