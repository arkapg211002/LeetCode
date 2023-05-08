// https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition



class Solution
{
    int mod=(int)Math.pow(10,9)+7;
    public int numSubseq(int nums[],int target)
    {
        Arrays.sort(nums);
        int n=nums.length;
        int e[]=new int[n];
        e[0]=1;
        for(int i=1;i<n;i++) e[i]=(e[i-1]*2)%mod;
        int l=0,r=n-1,c=0;
        while(l<=r)
        {
            if(nums[l]+nums[r]<target)
            {
                c=(c+e[r-l])%mod;
                l+=1;
            }
            else r-=1;
        }
        return c;
    }
}