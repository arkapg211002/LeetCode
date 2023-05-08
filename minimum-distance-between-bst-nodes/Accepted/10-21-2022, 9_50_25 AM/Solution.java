// https://leetcode.com/problems/minimum-distance-between-bst-nodes

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
    public int minDiffInBST(TreeNode root) {
        traverse(root);
        //System.out.println(l);
        //Collections.sort(l);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<l.size();i++)
        {
            min=(int)Math.min(min,(int)Math.abs(l.get(i)-l.get(i-1)));
        }
        return min;
        
    }
    public void traverse(TreeNode root)
    {
        if(root==null)return;
        traverse(root.left);
        l.add(root.val);
        traverse(root.right);
    }
}