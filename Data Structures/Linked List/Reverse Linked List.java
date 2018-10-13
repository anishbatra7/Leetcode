/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode forward = null;
        ListNode previous = null;
        
        ListNode curr = head;
        
        while(curr != null)
        {
            forward = curr.next;
            curr.next = previous;
            previous = curr;
            curr = forward;
        }
        
        return previous;
    }
}