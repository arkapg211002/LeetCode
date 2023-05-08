// https://leetcode.com/problems/height-of-binary-tree-after-subtree-removal-queries

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
    public int[] treeQueries(TreeNode root, int[] queries) {
        int a[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            TreeNode p=root;
            p=remove(p,queries[i]);
            int h=height(p);
            a[i]=h-1;
        }
        //preorder(root);
        //System.out.println(l);
        return a;
    }
    public int height(TreeNode root)
    {
        if(root==null)return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return (int)Math.max(lh,rh)+1;
    }
    public TreeNode remove(TreeNode root,int k)
    {
        if(root==null)return null;
        root.left=remove(root.left,k);
        root.right=remove(root.right,k);
        if(root.val==k)
        {
            root=null;
            return root;
        }
        //root.left=remove(root.left,k);
        
        return root;
    }
    /*public void preorder(TreeNode root)
    {
        if(root==null)return;
        l.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }*/
}