// https://leetcode.com/problems/count-good-nodes-in-binary-tree

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
    public int goodNode(TreeNode root, int max){
        if(root==null)
            return 0;
        int c=0;
        if(max<=root.val){
            c+=1;
            max= root.val;
        }
        if(root.left!=null)
            c+=goodNode(root.left , max);
        if(root.right!=null)
            c+=goodNode(root.right , max);
        return c;
        
    }
    public int goodNodes(TreeNode root) {
        return goodNode(root, -100000);        
    }
}