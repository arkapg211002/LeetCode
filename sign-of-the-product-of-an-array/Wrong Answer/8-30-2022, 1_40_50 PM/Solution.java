// https://leetcode.com/problems/sign-of-the-product-of-an-array

class Solution {
    public int arraySign(int[] nums) {
        long p=1;int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            p=p*(long)nums[i];
            //System.out.println(p);
        }
        //System.out.println(p);
        if(p>0)flag=1;
        else if(p<0)flag=-1;
        else if(p==0)flag=0;
        return flag;
    }
    
}