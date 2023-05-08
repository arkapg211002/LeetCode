// https://leetcode.com/problems/remove-nth-node-from-end-of-list

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
        ListNode hare = head, tortoise = head;
        while(n-- > 0) hare = hare.next;
        if (hare == null) return head.next;
        while (hare.next != null) {
            hare = hare.next;
            tortoise = tortoise.next;
        }
        tortoise.next = tortoise.next.next;
        return head;
    }
}