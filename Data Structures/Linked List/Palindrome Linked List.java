/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        Stack<Integer> check = new Stack<>();
        
        ListNode start = head;
        
        int len = 0;
        
        while(start != null){
            check.push(start.val);
            start = start.next;
            len += 1;
        }
        
        System.out.println(len);
        
        ListNode verify = head;
        
        for(int i= 1; i<= (len/2); i++){
            
            if(verify.val != check.pop()){
                return false;
            }
            
            verify = verify.next;
        }
        
        return true;
    }
}