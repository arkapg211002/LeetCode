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
    List<Integer>l=new ArrayList<>();
    int e=0;
    int o=0;
    public int rob(TreeNode root) {
        traverse(root);
        //return (int)Math.max(e,o);
        int a=Max_Sum(l,l.size()/2,l.size());
        int b=Max_Sum(l,l.size()-(l.size()/2),l.size());
        return (int)Math.max(a,b);
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
            l.add(s);
            if(level%2==0)e+=s;
            else o+=s;
            level+=1;
            b=new ArrayList<>();
        }
    }
    public int Max_Sum(List<Integer>arr, int K,
                          int N)
{
     
    // Stores states of dp
    int[] dp = new int[N + 1];
 
    // Initialise dp state
    Arrays.fill(dp, 0);
 
    // Stores the prefix sum
    int[] prefix = new int[N + 1];
 
    prefix[0] = 0;
 
    // Update the prefix sum
    for(int i = 1; i <= N; i++)
    {
        prefix[i] = prefix[i - 1] + arr.get(i-1);
    }
 
    // Base case for i < K
    dp[0] = 0;
 
    // For indices less than k
    // take all the elements
    for(int i = 1; i <= K - 1; i++)
    {
        dp[i] = prefix[i];
    }
 
    // For i >= K  case
    for(int i = K ; i <= N; ++i)
    {
         
        // Skip each element from i to
        // (i - K + 1) to ensure that
        // no K elements are consecutive
        for(int j = i; j >= (i - K + 1); j--)
        {
             
            // j-th element is skipped
 
            // Update the current dp state
            dp[i] = Math.max(dp[i], dp[j - 1] +
                         prefix[i] - prefix[j]);
        }
    }
 
    // dp[N] stores the maximum sum
    return dp[N];
}
}