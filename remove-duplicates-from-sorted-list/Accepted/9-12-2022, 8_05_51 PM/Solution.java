// https://leetcode.com/problems/remove-duplicates-from-sorted-list

class Solution {

public ListNode deleteDuplicates(ListNode head) {
    if(head == null){
        return null;
    }
    ListNode prev = head;
    ListNode curr = head.next;
    
    while(curr != null){
        if(curr.val == prev.val){
            curr = curr.next;
            prev.next = curr;
        }else{
            curr = curr.next;
            prev = prev.next;
        }
    }
    
    return head;
}
}