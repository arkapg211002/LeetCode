// https://leetcode.com/problems/longest-increasing-subsequence-ii

class Solution {
    public int lengthOfLIS(int[] nums, int k) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int prev=0;prev<=i-1;prev++)
            {
                if(nums[prev]<nums[i] && nums[i]-nums[prev]<=k)
                {
                    dp[i]=(int)Math.max(dp[i],dp[prev]+1);
                }
                ans=(int)Math.max(ans,dp[i]);
            }
        }
        return ans;
    }
}