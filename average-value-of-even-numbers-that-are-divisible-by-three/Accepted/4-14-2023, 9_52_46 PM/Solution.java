// https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three

class Solution {
    public int averageValue(int[] nums) {
        int s=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && nums[i]%3==0)
            {
                s+=nums[i];
                c+=1;
            }
        }
        if(c==0)return 0;
        else return s/c;
    }
}