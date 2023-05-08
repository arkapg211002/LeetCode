// https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent

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
    int s=0;
    public int sumEvenGrandparent(TreeNode root) {
        traverse(root,null,null);
        return s;
    }
    public void traverse(TreeNode n,TreeNode p,TreeNode gp)
    {
        if(n==null)return;
        if(gp!=null && gp.val%2==0)s+=n.val;
        gp=p;p=n;
        traverse(n.left,p,gp);
        traverse(n.right,p,gp);           
    }
}