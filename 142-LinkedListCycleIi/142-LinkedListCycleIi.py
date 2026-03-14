# Last updated: 3/14/2026, 11:50:59 AM
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        slow = fast = head

        while fast and fast.next:
            slow, fast = slow.next, fast.next.next

            if slow == fast :
                break

        if not fast or not fast.next:
            return None

        slow2 = head

        while slow != slow2:
            slow, slow2 = slow.next, slow2.next

        return slow