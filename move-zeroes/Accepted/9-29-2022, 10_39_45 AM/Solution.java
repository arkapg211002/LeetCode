// https://leetcode.com/problems/move-zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int k=0,c=0;
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)c+=1;
            else if(nums[i]!=0 && c==0)k+=1;
            else if(nums[i]!=0 && c>0)
            {
                nums[k]=nums[i];
                nums[i]=0;
                k+=1;
            }
        }        
    }    
}