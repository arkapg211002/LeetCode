// https://leetcode.com/problems/maximum-sum-bst-in-binary-tree

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
    int max=Integer.MIN_VALUE;
    public int maxSumBST(TreeNode root) {
        if(root==null)return 0;
        boolean b=bst(root);
        int m=0;
        if(b==true)
        {
            m=sum(root);
            max=(int)Math.max(max,m);
            //return max;
        }
        
        int lh=maxSumBST(root.left);
        int rh=maxSumBST(root.right);
        max=(int)Math.max(lh,max);
        max=(int)Math.max(rh,max);
        return max;
    }
    public boolean bst(TreeNode root)
    {
        if(root==null)return true;
        boolean lh=bst(root.left);
        boolean rh=bst(root.right);
        if(lh==true && rh==true && root.left==null && root.right==null)return true;
        else if(lh==true && rh==true && root.left.val<root.val && root.right==null)return true;
        else if(lh==true && rh==true && root.right.val>root.val && root.left==null)return true;
        else if(lh==true && rh==true && root.left.val<root.val && root.right.val>root.val)
            return true;        
        else return false;
    }
    public int sum(TreeNode root)
    {
        if(root==null)return 0;
        int lh=sum(root.left);
        int rh=sum(root.right);
        return (lh+rh+root.val);
    }
}