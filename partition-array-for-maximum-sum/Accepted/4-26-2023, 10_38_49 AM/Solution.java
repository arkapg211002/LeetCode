// https://leetcode.com/problems/partition-array-for-maximum-sum

class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return f(0,k,arr,arr.length,dp);
    }
    public int f(int ind,int k,int arr[],int n,int dp[])
    {
        if(ind==n)return 0;
        if(dp[ind]!=-1)return dp[ind];
        int maxele=Integer.MIN_VALUE,maxsum=Integer.MIN_VALUE;
        int last=(int)Math.min(n,ind+k);
        int c=0;
        for(int j=ind;j<last;j++)
        {
            c+=1;
            maxele=(int)Math.max(maxele,arr[j]);
            int res=(c*maxele)+f(j+1,k,arr,n,dp);
            maxsum=(int)Math.max(maxsum,res);
        }
        return dp[ind]=maxsum;
    }
}