// https://leetcode.com/problems/remove-linked-list-elements

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        while(head != null && head.val == val) {
            head = head.next;
        }
        
        if(head == null) {
            return head;
        }
        
        // check val from 2nd node since head.val is handled
        ListNode curr = head;
        while(curr != null & curr.next != null) {
            if(curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head; 
    }
}