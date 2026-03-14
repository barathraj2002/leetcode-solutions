// Last updated: 3/14/2026, 11:50:55 AM
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
class Solution {
    public void reorderList(ListNode head) {
        Deque<ListNode> d = new ArrayDeque<>();
        ListNode tempNode = head;
        while(tempNode != null){
            d.addLast(tempNode);
            tempNode = tempNode.next;
        }

        ListNode temp = new ListNode(0);
        while(!d.isEmpty()){
            if(d.size() >= 2){
            temp.next = d.pollFirst();
            temp = temp.next;

            
            
            temp.next = d.pollLast();
            temp = temp.next;
            }
            else {
                break;
            }
        }
        
        if(!d.isEmpty()){
            temp.next = d.pollLast();
            temp = temp.next;
            temp.next = null;
            
        }
        else{
                temp.next = null;
        }
        
        
    }
}