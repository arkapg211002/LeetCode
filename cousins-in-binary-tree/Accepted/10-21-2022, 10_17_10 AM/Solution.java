// https://leetcode.com/problems/cousins-in-binary-tree

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
class Pair{
    TreeNode parent;
    int level;
    public Pair(int level, TreeNode parent){
        this.level = level;
        this.parent = parent;
    }
}
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Pair no_x = findVal(root,x,0,null);
        Pair no_y = findVal(root,y,0,null);
        
        if(no_x.level == no_y.level && no_x.parent != no_y.parent) return true;
        
        return false;
    }
    Pair findVal(TreeNode root,int val, int level, TreeNode parent){
        if(root == null) return null;
        if(root.val == val) return new Pair(level, parent);
        
        Pair leftpair = findVal(root.left, val, level+1, root);
        Pair rightpair = findVal(root.right, val, level+1, root);
        
        return leftpair == null? rightpair: leftpair;
    }
}