// https://leetcode.com/problems/linked-list-random-node

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
class Solution 
{
    List<Integer> li = null ;

    public Solution(ListNode head) 
    {
        li = new ArrayList<Integer>();
        ListNode temp = head ;
        while(temp != null)
        {
            li.add(temp.val);
            temp = temp.next ;
        }
    }
    
    public int getRandom() 
    {
        int max = li.size() ;
        int min = 0 ;
        int range = max - min + 1;
            
        int rand = (int)(Math.random() * range) + min;
        while( rand >= li.size() )
        {
            rand = (int)(Math.random() * range) + min;
        }
        return li.get(rand) ;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */