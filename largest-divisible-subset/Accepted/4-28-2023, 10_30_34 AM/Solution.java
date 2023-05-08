// https://leetcode.com/problems/largest-divisible-subset

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int hash[]=new int[n];
        Arrays.fill(hash,1);
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            hash[i]=i;
            for(int prev=0;prev<=i-1;prev++)
            {
                if(nums[i]%nums[prev]==0 && dp[prev]+1>dp[i])
                {
                    dp[i]=dp[prev]+1;
                    hash[i]=prev;
                }
            }
        }
        int ans=-1,last=-1;
        for(int i=0;i<n;i++)
        {
            if(dp[i]>ans)
            {
                ans=dp[i];
                last=i;
            }
        }
        List<Integer>l=new ArrayList<>();
        l.add(nums[last]);
        while(hash[last] != last)
        {
            last= hash[last];
            l.add(nums[last]);
        }
        Collections.reverse(l);
        return l;
    }
}