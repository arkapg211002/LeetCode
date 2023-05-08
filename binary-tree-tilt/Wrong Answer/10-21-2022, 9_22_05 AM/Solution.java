// https://leetcode.com/problems/binary-tree-tilt

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
    public int findTilt(TreeNode root) {
        transform(root);
        return s;
        
    }
    public void transform(TreeNode root)
    {
        if(root==null)return;
        if(root.left==null && root.right==null)s+=0;
        else if(root.left==null && root.right!=null)s+=root.right.val;
        else if(root.left!=null && root.right==null)s+=root.left.val;
        else s+=(int)Math.abs(root.left.val-root.right.val);
        transform(root.left);
        transform(root.right);
    }
}