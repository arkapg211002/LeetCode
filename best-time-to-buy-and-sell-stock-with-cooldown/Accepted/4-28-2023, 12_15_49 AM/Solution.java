// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n][2];
        for(int r[]:dp)Arrays.fill(r,-1);
        return f(0,0,dp,n,prices);
    }
    public int f(int ind,int status,int dp[][],int n,int p[])
    {
        if(ind>=n)return 0;
        if(dp[ind][status]!=-1)return dp[ind][status];
        int profit;
        if(status==0)
        {
            int a = f(ind+1,0,dp,n,p);
            int b = -p[ind] + f(ind+1,1,dp,n,p);
            profit = (int)Math.max(a,b);
        }
        else
        {
            int c = f(ind+1,1,dp,n,p);
            int d = p[ind] + f(ind+2,0,dp,n,p);
            profit = (int)Math.max(c,d);
        }
        return dp[ind][status]=profit;
    }
}