// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal

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
    TreeNode root=null;
    public TreeNode bstFromPreorder(int[] preorder) {
        for(int i=0;i<preorder.length;i++)
        {
            root=insert(root,preorder[i]);
        }
        return root;
    }
    public TreeNode insert(TreeNode p,int k)
    {
        if(p==null)
        {
            p=new TreeNode(k);
            p.left=null;
            p.right=null;
        }
        else if(k<p.val) p.left=insert(p.left,k);
        else p.right=insert(p.right,k);
        return p;
    }
}