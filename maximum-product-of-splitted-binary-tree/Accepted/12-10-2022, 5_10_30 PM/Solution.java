// https://leetcode.com/problems/maximum-product-of-splitted-binary-tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    long max = 0;
    public int maxProduct(TreeNode root) {
        if(root == null) return 0;
        
        max = root.val;
        long total = sum(root);
        System.out.println(total);
        helper(root,total);
        return (int)(max % (Math.pow(10,9)+7));
    }
    
    private long helper(TreeNode root,long total){
        if(root == null) return 0;
        long left = helper(root.left,total);
        long right = helper(root.right,total);
        long rem = total - left;
        max = Math.max(max,rem * left);
        rem = total - right;
        max = Math.max(max,rem * right);
        return left + right + root.val;
    }
    
    private long sum(TreeNode root){
        if(root == null) return 0;
        long left = sum(root.left);
        long right = sum(root.right);
        return left+right+root.val;
    }
}