// Last updated: 3/14/2026, 11:51:16 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Deque<ListNode> d = new ArrayDeque<>();
        ListNode temp = head;
        while(temp != null){
            d.addLast(temp);
            temp = temp.next;
        }
        if(d.size() == 1){
            return null;
        }
        int i = 0 ;
        int size = d.size();
        while(!d.isEmpty()){
            if(i == size - n - 1 || size - n -1 < 0){
                if(i == 0 && size - n -1 < 0){
                   d.pollFirst();
                   head = d.pollFirst();
                   break;
                }
                else{
                temp =d.pollFirst();
                d.pollFirst();
                temp.next = d.peekFirst() == null ? null : d.pollFirst();
                break;
                }
            }
            else{
                d.pollFirst();
                i++;
            }
        }
        return head;
    }
}