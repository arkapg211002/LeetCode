// https://leetcode.com/problems/longest-mountain-in-array

class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        for(int i=0;i<n;i++)
        {
            for(int prev=0;prev<=i-1;prev++)
            {
                if(arr[prev]<arr[i] && dp1[prev]+1>dp1[i])
                {
                    dp1[i]=dp1[prev]+1;
                }
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int prev=n-1;prev>i;prev--)
            {
                if(arr[prev]<arr[i] && dp2[prev]+1>dp2[i])
                {
                    dp2[i]=dp2[prev]+1;
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(dp1[i]>1 && dp2[i]>1)
                max=(int)Math.max(max,dp1[i]+dp2[i]-1);
        }
        return max;
    }
}