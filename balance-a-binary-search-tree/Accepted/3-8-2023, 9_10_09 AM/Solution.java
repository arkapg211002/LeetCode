// https://leetcode.com/problems/balance-a-binary-search-tree

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
    TreeNode p=null;
    public TreeNode balanceBST(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        inorder(root,l);
        //System.out.println(l);
        return bst(l,0,l.size()-1,p);
        
    }
    public void inorder(TreeNode root,List<Integer>l)
    {
        if(root==null)return;
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    public TreeNode bst(List<Integer>l,int left,int right,TreeNode p)
    {
        if(left>right)return null;
        int m=(left+right)/2;
        p=new TreeNode(l.get(m));
        p.left=bst(l,left,m-1,p.left);
        p.right=bst(l,m+1,right,p.right);
        return p;
    }
}