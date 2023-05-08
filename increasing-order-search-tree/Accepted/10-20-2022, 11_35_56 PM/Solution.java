// https://leetcode.com/problems/increasing-order-search-tree

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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode res=new TreeNode(0);
        TreeNode current=new TreeNode();
        current=res;
        form(root,l);
        for(int i=0;i<l.size();i++)
        {
            current.left=null;
            current.right=new TreeNode(l.get(i));
            current=current.right;
        }
        return res.right;
        
    }
    public void form(TreeNode root,List<Integer>l)
    {
        if(root==null)return;
        form(root.left,l);
        l.add(root.val);
        form(root.right,l);
    }
}