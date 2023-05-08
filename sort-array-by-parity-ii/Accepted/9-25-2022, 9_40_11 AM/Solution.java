// https://leetcode.com/problems/sort-array-by-parity-ii

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int eve=0,odd=1;
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                a[eve]=nums[i];
                eve+=2;
            }
            else
            {
                a[odd]=nums[i];
                odd+=2;
            }
        }
        return a;
    }
}