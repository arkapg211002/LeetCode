// https://leetcode.com/problems/univalued-binary-tree

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
    HashSet<Integer>h=new HashSet<>();
    public boolean isUnivalTree(TreeNode root) {
        traversal(root);
        if(h.size()==1)return true;
        else return false;
    }
    public void traversal(TreeNode root)
    {
        if(root==null)return;
        h.add(root.val);
        traversal(root.left);
        traversal(root.right);
    }
}