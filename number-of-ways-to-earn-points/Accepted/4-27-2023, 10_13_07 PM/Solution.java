// https://leetcode.com/problems/number-of-ways-to-earn-points

class Solution {
    int mod=(int)Math.pow(10,9)+7;
    public int waysToReachTarget(int target, int[][] types) {
        int n=types.length;
        int dp[][]=new int[n][target+1];
        for(int r[]:dp)Arrays.fill(r,-1);
        return f(n-1,target,types,dp);
    }
    public int f(int ind,int target,int types[][],int dp[][])
    {
        if(target==0)return 1;
        if(ind<0)return 0;
        if(dp[ind][target]!=-1)return dp[ind][target]%mod;
        int ans=0;
        for(int i=0;i<=types[ind][0];i++)
        {
            if(i*types[ind][1]<=target)
                ans=((ans%mod)+f(ind-1,target-(i*types[ind][1]),types,dp)%mod)%mod;
        }
        return dp[ind][target]=ans%mod;
    }
}