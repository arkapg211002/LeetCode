// https://leetcode.com/problems/partition-equal-subset-sum

/*class Solution {
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
}*/


class Solution {
    public boolean canPartition(int arr[]) {
        int n=arr.length;
        int totSum=Arrays.stream(arr).sum();
        if (totSum%2==1) return false;
        else
        {
            int k = totSum/2;
            boolean dp[][]=new boolean[n][k+1];
            for(int i=0; i<n; i++)dp[i][0] = true;
            if(arr[0]<=k)dp[0][arr[0]] = true;
            for(int ind = 1; ind<n; ind++)
            {
                for(int target= 1; target<=k; target++)
                {
                    boolean notTaken = dp[ind-1][target];
                    boolean taken = false;
                    if(arr[ind]<=target)taken = dp[ind-1][target-arr[ind]];
                    dp[ind][target]= notTaken||taken;
                }
            }
            return dp[n-1][k];
        }
    }
}