// https://leetcode.com/problems/sum-of-left-leaves

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
    public int sumOfLeftLeaves(TreeNode root) {
        
        return sum(root, 0, false);
    }
    
    private int sum(TreeNode root, int sum, boolean check){
        
        if(root==null){
            return 0;
        }
        
        if(root.left==null && root.right==null && check){
            sum += root.val;
        }
        
        return sum + sum(root.left, sum, true) + sum(root.right, sum, false);
    }
    
}