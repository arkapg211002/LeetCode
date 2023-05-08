// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array

class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=Arrays.stream(nums).sum(),s=0;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]>0)
            {
                s+=nums[i]%10;
                nums[i]/=10;
            }
        }
        return (int)Math.abs(esum-s);
    }
}