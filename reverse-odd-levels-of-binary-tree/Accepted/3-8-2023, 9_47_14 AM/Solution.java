// https://leetcode.com/problems/reverse-odd-levels-of-binary-tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        reverse(root.left,root.right,1);
        return root;
    }
    public void reverse(TreeNode n1,TreeNode n2,int l)
    {
        if(n1==null || n2==null)return;
        if(l%2!=0)
        {
            int t=n1.val;
            n1.val=n2.val;
            n2.val=t;
        }
        reverse(n1.left,n2.right,l+1);
        reverse(n1.right,n2.left,l+1);
    }
}