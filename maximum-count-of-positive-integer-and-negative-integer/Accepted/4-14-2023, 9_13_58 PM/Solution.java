// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer

class Solution {
    public int maximumCount(int[] nums) {
        int n=0,p=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)continue;
            else if(nums[i]>0)p+=1;
            else n+=1;
        }
        return (int)Math.max(p,n);
    }
}