// https://leetcode.com/problems/partition-equal-subset-sum

class Solution {
    public boolean canPartition(int[] nums) {
        int s=Arrays.stream(nums).sum();
        if(s%2!=0)return false;
        int n=nums.length;
        s=s/2;
        int dp[][]=new int[n][s+1];
        for(int i=0;i<n;i++)dp[i][0]=1;
        if(nums[0]<=s)dp[0][nums[0]]=1;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=s;j++)
            {
                int nt=dp[i-1][j];
                int t=0;
                if(nums[i]<=s)
                    t=dp[i-1][s-nums[i]];
                dp[i][j]=nt | t;
            }
        }
        return (dp[n-1][s]==1)?true:false;
    }
}