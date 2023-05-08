// https://leetcode.com/problems/find-the-middle-index-in-array

class Solution {
    public int findMiddleIndex(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i]+nums[i-1];
            
        }
        
        for(int i=0;i<nums.length;i++)
        {
            int ls,rs;
            if(i==0)
            {
                ls=0;
                rs=nums[nums.length-1]-nums[0];
            }
            else if(i==nums.length-1)
            {
                ls=nums[i-1];
                rs=0;
            }
            else
            {
                ls=nums[i-1];
                rs=nums[nums.length-1]-nums[i];
            }
            if(ls==rs)
            {
                return i;
            }
            
        }
        return -1;
    }
}