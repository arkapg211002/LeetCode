// https://leetcode.com/problems/check-completeness-of-a-binary-tree

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
    boolean res=true;
    LinkedList<TreeNode>q=new LinkedList<>();
    List<Integer>b=new ArrayList<>();
    int h=0;
    public boolean isCompleteTree(TreeNode root) {
        h=height(root);
        traverse(root);
        if(h==1)return true;
        return res;
    }
    public int height(TreeNode root)
    {
        if(root==null)return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return (int)Math.max(lh,rh)+1;
    }
    public void traverse(TreeNode root)
    {
        TreeNode p=root;
        if(p==null)return;
        q.add(p);
        int level=1;
        outer:
        while(q.isEmpty()==false)
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                p=q.removeFirst();
                b.add(p.val);
                if(p.left!=null)q.add(p.left);
                if(p.right!=null)q.add(p.right);
                if(level==h-1 && p.left==null && p.right!=null)
                {
                    res=false;
                    break outer;
                }
                if(i<n-1 && p.left!=null && p.right==null)
                {
                    res=false;
                    break outer;
                }
            }
            if(level<h && b.size()!=(int)Math.pow(2,level-1))res=false;
            if(level==h && b.size()==1)res=false;
            if(level==h && b.size()==(int)Math.pow(2,level-1))res=false;
            level+=1;
            b=new ArrayList<>();
            
        }
    }
}