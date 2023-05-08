// https://leetcode.com/problems/leaf-similar-trees

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
    List<Integer>l=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        addleaf(root1);
        List<Integer>l1=l;
        l=new ArrayList<>();
        addleaf(root2);
        if(l1.equals(l)==true)return true;
        else return false;
    }
    public void addleaf(TreeNode root)
    {
        if(root==null)return;
        if(root.left==null && root.right==null)l.add(root.val);
        addleaf(root.left);
        addleaf(root.right);
    }
}