// https://leetcode.com/problems/maximum-width-of-binary-tree

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
     LinkedList<pair> q= new LinkedList <>();
        int max=Integer.MIN_VALUE;
        if(root==null)
            return 0; // why not null coz see eg 1 when 2 L will come with null we cant add anything to it 
        q.addLast(new pair(root , 0));
        
        while(!q.isEmpty())
        {
             int size=q.size();
        
             max = Math.max(max, (q.getLast().level - q.getFirst().level + 1));

            for(int i=0;i<size;i++)
            {
                pair ele=q.removeFirst();
                if(ele.root.left!=null)
                {
                    q.addLast(new pair(ele.root.left,2*ele.level));
                }
                if(ele.root.right!=null)
                {
                     q.addLast(new pair(ele.root.right,2*ele.level+1));
                }
            }
        }
        return max;
    }
    

    // making a custom pair class to get the root and level
    static class pair
    {
        int level;
        TreeNode root;
    
    public pair ( TreeNode root,int level)
    {
        this.level=level;
        this.root =root ;
    }
    }
}
