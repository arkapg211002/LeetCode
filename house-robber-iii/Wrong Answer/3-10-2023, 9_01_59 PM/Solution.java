// https://leetcode.com/problems/house-robber-iii

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
    LinkedList<TreeNode>q=new LinkedList<>();
    List<Integer>b=new ArrayList<>();
    int e=0;
    int o=0;
    public int rob(TreeNode root) {
        traverse(root);
        return (int)Math.max(e,o);
    }
    public void traverse(TreeNode root)
    {
        TreeNode p=root;
        if(p==null)return;
        q.add(p);
        int level=0;
        
        while(q.isEmpty()==false)
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                p=q.removeFirst();
                b.add(p.val);
                if(p.left!=null)q.add(p.left);
                if(p.right!=null)q.add(p.right);
            }
            int s=0;
            for(int i=0;i<b.size();i++)s+=b.get(i);
            if(level%2==0)e+=s;
            else o+=s;
            level+=1;
            b=new ArrayList<>();
        }
    }
}