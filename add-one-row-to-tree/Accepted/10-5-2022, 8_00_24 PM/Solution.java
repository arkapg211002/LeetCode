// https://leetcode.com/problems/add-one-row-to-tree

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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        addOneUtil(root,val,depth);
        return root;
    }
    public void addOneUtil(TreeNode root,int val,int depth){
        if(root==null) return;
        if(depth == 2){
            TreeNode newLeft = new TreeNode(val);
            TreeNode left = root.left;
            root.left = newLeft;
            newLeft.left = left;
			
			TreeNode newRight = new TreeNode(val);
            TreeNode right = root.right;
            root.right = newRight;
            newRight.right = right;
            return;
        }
        addOneUtil(root.left,val,depth-1);
        addOneUtil(root.right,val,depth-1);
    }
}