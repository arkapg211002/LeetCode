// https://leetcode.com/problems/number-of-unequal-triplets-in-array

class Solution {
    public int unequalTriplets(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if(nums[i]!=nums[j] && nums[i]!=nums[k] && nums[j]!=nums[k])c+=1;
                }
            }
        }
        return c;
    }
}