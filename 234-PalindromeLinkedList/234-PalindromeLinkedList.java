// Last updated: 3/14/2026, 11:50:42 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.HashSet;
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = reverse(slow.next);
        ListNode temp = head;
        slow = slow.next;
        
        while(slow != null){
            if(temp.val == slow.val){
                temp = temp.next;
                slow = slow.next;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public ListNode reverse(ListNode head){

        ListNode curr = head, prev = null, next = null;
        System.out.println(curr.val+" Head");
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            System.out.println(prev.val+" "+ " <-");
        }
        return prev;
    }
}