// https://leetcode.com/problems/maximum-ascending-subarray-sum

class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=Integer.MIN_VALUE,c=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])c+=nums[i];
            else 
            {
                if(c>max)max=c;
                c=nums[i];
            }
        }
        return (int)Math.max(max,c);
    }
}