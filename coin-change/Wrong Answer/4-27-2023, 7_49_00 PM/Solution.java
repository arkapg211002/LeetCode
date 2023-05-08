// https://leetcode.com/problems/coin-change

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int r[]:dp)Arrays.fill(r,-1);
        int ans=f(n-1,amount,coins,dp);
        if(ans>=Integer.MAX_VALUE)return -1;
        return ans;
    }
    public int f(int ind,int amount,int coins[],int dp[][])
    {
        if(ind == 0)
        {
            if(amount % coins[0] == 0)return amount/coins[0];
            else return Integer.MAX_VALUE;
        }
        if(dp[ind][amount]!=-1)return dp[ind][amount];
        int nottake=0+f(ind-1,amount,coins,dp);
        int take=Integer.MAX_VALUE;
        if(coins[ind]<=amount)
            take=1+f(ind,amount-coins[ind],coins,dp);
        return dp[ind][amount]=(int)Math.min(nottake,take);
    }
}