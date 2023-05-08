// https://leetcode.com/problems/minimum-number-of-operations-to-sort-a-binary-tree-by-level

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
    int m=0;
    public int minimumOperations(TreeNode root) {
        if(root==null)return 0;
        level(root);
        return m;
    }
    public void level(TreeNode root)
    {
        TreeNode p=root;
        if(p==null)return;
        q.addLast(p);
        while(q.isEmpty()==false)
        {
            int n=q.size();
            int c=0;
            for(int i=0;i<n;i++)
            {
                p=q.removeFirst();
                b.add(p.val);
                if(p.left!=null)q.add(p.left);
                if(p.right!=null)q.add(p.right);
            }
            List<Integer>l=new ArrayList<>();
            l.addAll(b);
            Collections.sort(b);
            for(int j=0;j<b.size();j++)
            {
                if(b.get(j)!=l.get(j))c+=1;
            }
            m+=(int)Math.ceil(c*1.0/2);
            b=new ArrayList<>();
        }
    }
}