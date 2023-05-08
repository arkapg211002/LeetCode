// https://leetcode.com/problems/binary-tree-paths

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
    public List<String> binaryTreePaths(TreeNode root) {
        return getPaths(root, "");
    }
    
    private List<String> getPaths(TreeNode root, String s) {
        List<String> res = new ArrayList<>();
        if(root==null)
            return res;
        if(root.right==null && root.left ==null) {
            res.add(s+ root.val);
            return res;
        }
        res.addAll(getPaths(root.left,s+root.val + "->"));
        res.addAll(getPaths(root.right,s+root.val + "->"));
        return res;
    }
    
}