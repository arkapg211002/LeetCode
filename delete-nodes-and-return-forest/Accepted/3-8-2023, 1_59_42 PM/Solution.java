// https://leetcode.com/problems/delete-nodes-and-return-forest

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
    List<TreeNode>f=new ArrayList<TreeNode>();
    List<Integer>l=new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(int i=0;i<to_delete.length;i++)l.add(to_delete[i]);
        int res=dfs(root);
        if(res==1)f.add(root);
        return f;
    }
    public int dfs(TreeNode root)
    {
        if(root==null)return 0;
        if(dfs(root.left)==0)root.left=null;
        if(dfs(root.right)==0)root.right=null;
        if(l.contains(root.val)==true)
        {
            if(root.left!=null)f.add(root.left);
            if(root.right!=null)f.add(root.right);
            root=null;
            return 0;
        }
        return 1;

    }
    
}