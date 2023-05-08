// https://leetcode.com/problems/house-robber-ii

class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int a[]=new int[nums.length-1];
        int b[]=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++)
            a[i]=nums[i];
        for(int i=1;i<nums.length;i++)
            b[i-1]=nums[i];
        int dp[]=new int[n-1];
        Arrays.fill(dp,-1);
        int ad=f(n-2,a,dp);
        Arrays.fill(dp,-1);
        int bd=f(n-2,b,dp);
        return (int)Math.max(ad,bd);
    }
    public int f(int ind,int nums[],int dp[])
    {
        if(ind < 0) return 0;
        if(ind==0)return nums[ind];
        if(dp[ind] != -1)return dp[ind];
        int notpick=0+f(ind-1,nums,dp);
        int pick=nums[ind]+f(ind-2,nums,dp);
        return dp[ind]=(int)Math.max(notpick,pick);
    }
}