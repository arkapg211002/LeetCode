// https://leetcode.com/problems/evaluate-boolean-binary-tree

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
    public boolean evaluateTree(TreeNode root) {
        if(root.val==0)return false;
        if(root.val==1)return true;
        boolean l=evaluateTree(root.left);
        boolean r=evaluateTree(root.right);
        boolean result=true;;
        if(root.val==2)result=l|r;
        else if(root.val==3)result=l&r;
        return result;
        
    }
}