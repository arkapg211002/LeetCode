// https://leetcode.com/problems/maximum-binary-tree-ii

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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        TreeNode temp = root;
        TreeNode tempParent = null;
        /**
        * Find node in the right subtree which is more than incoming val
        */
        while (temp != null && val < temp.val) {
            tempParent = temp;
            temp = temp.right;
        }

        TreeNode newNode = new TreeNode(val);
        // case 1: val > root.val
        if (tempParent == null) {
            tempParent = newNode;
            tempParent.left = root;
            return tempParent;
        }

        if (temp == null) {
            //val is smallest in right subtree
            tempParent.right = newNode;
        } else {
            //val is more than some node in right subtree and les than   some nodes
            tempParent.right = newNode;
            newNode.left = temp;
        }
        return root;
    }
}