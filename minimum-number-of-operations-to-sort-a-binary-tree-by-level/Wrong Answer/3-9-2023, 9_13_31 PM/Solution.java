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
            m+=minswaps(b);
            b=new ArrayList<>();
        }
    }
    public int minswaps(List<Integer> b)
    {
        List<Integer>l=new ArrayList<>();
        l.addAll(b);
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<l.size();i++)
        {
            h.put(b.get(i),i);
        }
        Collections.sort(l);
        int ans=0;
        for(int i=0;i<l.size();i++)
        {
            if(b.get(i)!=l.get(i))
            {
                ans+=1;
                int in=b.get(i);
                swap(b, i, h.get(l.get(i)));
                h.put(in, h.get(l.get(i)));
                h.put(l.get(i), i);
            }
        }
        return ans;
    }
    public void swap(List<Integer> b, int i, int j)
    {
        int temp=b.get(i);
        b.set(i,b.get(j));
        b.set(j,temp);
    }
}