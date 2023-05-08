// https://leetcode.com/problems/reverse-linked-list

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
    public ListNode reverseList(ListNode head) {
        //previous node of head i.e null
        ListNode prev=null;        
        while(head!=null){
         ListNode next_node=head.next;
            //setting head.next to prev
            head.next=prev;
            prev=head;
            head=next_node;
        }
        return prev;
    }
}