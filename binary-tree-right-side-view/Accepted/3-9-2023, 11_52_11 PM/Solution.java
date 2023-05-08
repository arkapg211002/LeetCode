// https://leetcode.com/problems/binary-tree-right-side-view

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
    public List<Integer> rightSideView(TreeNode root) {
        List arr=new ArrayList<>();
        util(arr,root,0);
        return arr;
    }
    public void util(List<Integer> arr,TreeNode root,int level){
        if(root==null) return;
        if(arr.size()<=level){
            arr.add(level,root.val);
        }else{
            arr.set(level,root.val);
        }
        util(arr,root.left,level+1);
        util(arr,root.right,level+1);
    }
}