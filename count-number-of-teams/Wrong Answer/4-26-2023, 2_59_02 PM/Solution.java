// https://leetcode.com/problems/count-number-of-teams

class Solution {
    public int numTeams(int[] rating) {
        return lis(rating);
    }
    public int lis(int arr[])
    {
        int n = arr.length;
        int[] dp= new int[n];
        int[] dp2= new int[n];
        int[] ct= new int[n];
        int[] ct2= new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(ct,1);
        Arrays.fill(dp2,1);
        Arrays.fill(ct2,1);    
        for(int i=0; i<=n-1; i++)
        {
            for(int prev_index = 0; prev_index <=i-1; prev_index ++)
            {
                if(arr[prev_index]<arr[i] && dp[prev_index]+1>dp[i])
                {
                    dp[i] = dp[prev_index]+1;
                    ct[i] = ct[prev_index];
                }
                else if(arr[prev_index]<arr[i] && dp[prev_index]+1==dp[i])
                    ct[i] = ct[i] + ct[prev_index];
            }
        }
        for(int i=n-1; i>=0; i--)
        {
            for(int prev_index = n-1; prev_index >i; prev_index --)
            {
                if(arr[prev_index]<arr[i] && dp2[prev_index]+1>dp2[i])
                {
                    dp2[i] = dp2[prev_index]+1;
                    ct2[i] = ct2[prev_index];
                }
                else if(arr[prev_index]<arr[i] && dp2[prev_index]+1==dp2[i])
                    ct2[i] = ct2[i] + ct2[prev_index];
            }
        }
        int nos=0;
        for(int i=0; i<=n-1; i++)
        {
            System.out.println(dp[i]+" "+ct[i]+" "+dp2[i]+" "+ct2[i]);
            if(dp[i]==3)nos+=ct[i];  
            if(dp2[i]==3)nos+=ct2[i];
        }
        return nos;
    }
}