// https://leetcode.com/problems/deepest-leaves-sum

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
    public int deepestLeavesSum(TreeNode root) {
        int h=height(root);
        leaves(root,h,1);
        return s;
    }
    public int height(TreeNode root)
    {
        if(root==null)return 0;
        return (int)Math.max(height(root.left),height(root.right))+1;
    }
    public void leaves(TreeNode root,int h,int d)
    {
        if(root!=null)
        {
            if(d==h)s+=root.val;
            leaves(root.left,h,d+1);
            leaves(root.right,h,d+1);
        }
    }
}