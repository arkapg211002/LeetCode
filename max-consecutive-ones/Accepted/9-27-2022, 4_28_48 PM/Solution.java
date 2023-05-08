// https://leetcode.com/problems/max-consecutive-ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE,c=0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==1)c+=1;
            else 
            {
                
                max=(int)Math.max(max,c);
                c=0;
            }
        }
        return (int)Math.max(max,c);
    }
}