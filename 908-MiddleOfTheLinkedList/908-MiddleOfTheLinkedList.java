// Last updated: 3/14/2026, 11:50:27 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNodenext ) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast.next == null){
                return slow;
            }
            else if(fast.next != null && fast.next.next == null){
                return slow.next;
            }
        }
        return slow.next;
    }
}