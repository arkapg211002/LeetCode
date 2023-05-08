// https://leetcode.com/problems/diameter-of-binary-tree

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
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
    return ans; 
}

public int dfs(TreeNode root){
    
    if(root == null)
        return 0;
    
    int ld = dfs(root.left);
    int rd = dfs(root.right);
    ans = Math.max(ans, ld+rd); 
    return 1+ Math.max(ld,rd);
    }
}