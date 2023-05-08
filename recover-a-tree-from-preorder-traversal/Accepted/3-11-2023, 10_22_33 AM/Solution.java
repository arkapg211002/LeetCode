// https://leetcode.com/problems/recover-a-tree-from-preorder-traversal

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
    int i=0;
    public TreeNode recoverFromPreorder(String traversal) {
        return traverse(traversal,0);
    }
    public TreeNode traverse(String traversal,int level)
    {
        if(i==traversal.length())return null;
        int j=i,c=0;
        while(traversal.charAt(j)=='-')
        {
            c+=1;
            j+=1;
        }
        if(c==level)
        {
            int k=j;
            while(j<traversal.length() && traversal.charAt(j)!='-')j+=1;
            String sub=traversal.substring(k,j);
            i=j;
            TreeNode root=new TreeNode(Integer.parseInt(sub));
            root.left=traverse(traversal,level+1);
            root.right=traverse(traversal,level+1);
            return root;
        }
        else return null;
    }
}