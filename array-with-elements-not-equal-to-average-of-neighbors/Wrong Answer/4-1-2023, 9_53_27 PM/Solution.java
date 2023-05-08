// https://leetcode.com/problems/array-with-elements-not-equal-to-average-of-neighbors

class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i++)
        {
            if((double)((nums[i-1]+nums[i+1])*1.0/2)==nums[i]*1.0)
            {
                int t=nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=t;
            }
        }
        return nums;
    }
}