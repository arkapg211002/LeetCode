// https://leetcode.com/problems/minimum-cost-to-split-an-array

class Solution {
    public int minCost(int[] nums, int k) {
        int n= nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int len[][] = new int[n][n];
        for(int r[]:len)Arrays.fill(r,0);
        for(int i=0;i<n;i++)
        {
            int count[]=new int[n];
            Arrays.fill(count,0);
            int c=0;
            for(int j=i;j<n;j++)
            {
                count[nums[j]]+=1;
                if(count[nums[j]]==2)c+=2;
                else if(count[nums[j]]>2)c+=1;
                len[i][j]=c;
            }
        }
        return f(0,nums,k,len,dp);
    }
    public int f(int ind,int nums[],int k,int len[][],int dp[])
    {
        if(ind >= nums.length)return 0;
        if(dp[ind]!=-1)return dp[ind];
        dp[ind]=Integer.MAX_VALUE;
        for(int i=ind;i<nums.length;i++)
        {
            int current = len[ind][i]+k;
            int next = f(i+1,nums,k,len,dp);
            dp[ind]=(int)Math.min(dp[ind],current+next);
        }
        return dp[ind];
    }
}