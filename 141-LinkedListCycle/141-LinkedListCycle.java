// Last updated: 3/14/2026, 11:50:57 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;

        while(true){
            if(head != null){
            temp1 = temp1.next;
            }
            else{
                return false;
            }
            if(temp2.next != null && temp2.next.next != null){
                temp2 = temp2.next.next;
            }
            else{
                return false;
            }
            

            if(temp1 == temp2){
                return true;
            }
            if(temp2 == null){
                return false;
            }
        }
        
    }
}