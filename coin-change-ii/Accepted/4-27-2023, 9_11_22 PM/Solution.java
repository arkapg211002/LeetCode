// https://leetcode.com/problems/coin-change-ii

class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int r[]:dp)Arrays.fill(r,-1);
        return f(n-1,amount,coins,dp);
    }
    public int f(int ind,int amount,int coins[],int dp[][])
    {
        if(ind==0)
        {
            if(amount%coins[0]==0)return 1;
            else return 0;
        }
        if(dp[ind][amount]!=-1)return dp[ind][amount];
        int nt=f(ind-1,amount,coins,dp);
        int t=0;
        if(coins[ind]<=amount)t=f(ind,amount-coins[ind],coins,dp);
        return dp[ind][amount]=nt+t;
    }
}