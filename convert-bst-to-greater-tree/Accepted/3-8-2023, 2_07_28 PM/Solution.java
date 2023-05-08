// https://leetcode.com/problems/convert-bst-to-greater-tree

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
    public TreeNode convertBST(TreeNode root) {
        int t=traverse(root);
        return root;
    }
    public int traverse(TreeNode root)
    {
        if(root==null)return 0;
        traverse(root.right);
        s+=root.val;
        root.val=s;
        traverse(root.left);
        return s;
    }
}