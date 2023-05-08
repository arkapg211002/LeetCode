// https://leetcode.com/problems/maximum-binary-tree

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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length-1);
    }
    private int find(int[] nums, int start, int stop){
        int maxInd = stop;
        for(int i = start; i < stop; i++){
            if(nums[maxInd] < nums[i]){
                maxInd = i;
            }
        }
        return maxInd;
    }
    private TreeNode construct(int[] nums, int start, int stop){
        if(stop < start){
            return null;
        }
        int maxInd = find(nums, start, stop);
        TreeNode root = new TreeNode(nums[maxInd]);
        root.left = construct(nums, start, maxInd-1);
        root.right = construct(nums, maxInd+1, stop);
        return root;
    }
}