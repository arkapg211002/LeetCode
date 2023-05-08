// https://leetcode.com/problems/sign-of-the-product-of-an-array

class Solution {
    public int arraySign(int[] nums) {
        int p=1,flag=0;
        for(int i=0;i<nums.length;i++)
        {
            p*=nums[i];
        }
        if(p>0)flag=1;
        else if(p<0)flag=-1;
        else if(p==0)flag=0;
        return flag;
    }
    
}