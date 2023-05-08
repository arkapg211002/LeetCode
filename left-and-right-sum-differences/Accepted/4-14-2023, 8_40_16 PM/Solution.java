// https://leetcode.com/problems/left-and-right-sum-differences

class Solution {
    public int[] leftRigthDifference(int[] nums) {
        for(int i=1;i<nums.length;i++)
            nums[i]+=nums[i-1];
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)ans[i]=nums[nums.length-1]-nums[i];
            else if(i==nums.length-1)ans[i]=nums[i-1];
            else
            {
                int d=nums[nums.length-1]-nums[i];
                ans[i]=(int)Math.abs(d-nums[i-1]);
            }
        }
        return ans;
    }
}