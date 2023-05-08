// https://leetcode.com/problems/even-odd-tree

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
    HashSet<Integer>h=new HashSet<>();
    public boolean isEvenOddTree(TreeNode root) {
        traversal(root);
        return res;
    }
    public void traversal(TreeNode root)
    {
        TreeNode p=root;
        if(p==null)return;
        q.add(p);
        int level=0;
        outer:
        while(q.isEmpty()==false)
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                p=q.removeFirst();
                b.add(p.val);
                h.add(p.val);
                if(level%2!=0 && p.val%2!=0)
                {
                    res=false;
                    break outer;
                }
                if(level%2==0 && p.val%2==0)
                {
                    res=false;
                    break outer;
                }
                if(p.left!=null)q.add(p.left);
                if(p.right!=null)q.add(p.right);
            }
            if(h.size()<b.size())
            {
                res=false;
                h=new HashSet<>();
                break;
            }
            List<Integer>l=new ArrayList<>();
            l.addAll(b);
            if(level%2==0)Collections.sort(b);
            else Collections.sort(b,Collections.reverseOrder());
            for(int i=0;i<l.size();i++)
            {
                if(l.get(i)!=b.get(i))
                {
                    res=false;
                    break;
                }
            }
            b=new ArrayList<>();
            h=new HashSet<>();
            level+=1;
        }
        
        
        
    }
    
}