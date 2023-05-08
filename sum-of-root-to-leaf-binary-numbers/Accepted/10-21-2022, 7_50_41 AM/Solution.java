// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers

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
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        pathroottoleaf(root,0);
        return sum;
        
    }
    public void pathroottoleaf(TreeNode root,int a)
    {
        if(root==null)return;
        if(root.left==null && root.right==null)
        {
            sum+=(root.val==0)?(a*2):(a*2+1);
            return;
        }
        
        pathroottoleaf(root.left,root.val==0?a*2:a*2+1);
        pathroottoleaf(root.right,root.val==0?a*2:a*2+1);
    }
}