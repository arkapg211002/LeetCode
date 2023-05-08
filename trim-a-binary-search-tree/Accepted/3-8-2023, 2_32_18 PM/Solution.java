// https://leetcode.com/problems/trim-a-binary-search-tree

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
    int l,h;
    public TreeNode trimBST(TreeNode root, int low, int high) {
        l=low;h=high;
        return traverse(root);
        
    }
    public TreeNode traverse(TreeNode root)
    {
        if(root==null)return null;
        root.left=traverse(root.left);
        root.right=traverse(root.right);
        if(root.val<l || root.val>h)
        {
            if(root.left==null)root=root.right;
            else if(root.right==null)root=root.left;
            

        }
        return root;
    }
}