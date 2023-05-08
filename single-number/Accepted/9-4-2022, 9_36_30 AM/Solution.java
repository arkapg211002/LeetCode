// https://leetcode.com/problems/single-number

class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)return nums[0];
        Arrays.sort(nums);
        int i=0,j=nums.length,c=0;
        while(i<j)
        {
            if(i+1==j)break;
            else if(nums[i]==nums[i+1])i+=2;
            else if(nums[i]!=nums[i+1])return nums[i];
        }
        return nums[nums.length-1];
        
    }
}