// https://leetcode.com/problems/target-sum

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=Arrays.stream(nums).sum();
        if(sum-target < 0)return 0;
        if((sum-target)%2==1)return 0;
        int s2=(sum-target)/2;
        int dp[][]=new int[n][s2+1];
        for(int r[]:dp)Arrays.fill(r,-1);
        return f(n-1,nums,s2,dp);
    }
    public int f(int ind,int nums[],int target,int dp[][])
    {
        if(ind==0)
        {
            if(target==0 && nums[0]==0)return 2;
            else if(target==0 || nums[0]==target)return 1;
            else return 0;
        }
        if(dp[ind][target]!=-1)return dp[ind][target];
        int nt=f(ind-1,nums,target,dp);
        int t=0;
        if(nums[ind]<=target)
            t=f(ind-1,nums,target-nums[ind],dp);
        return dp[ind][target]=nt+t;
    }
}