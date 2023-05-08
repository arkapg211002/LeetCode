// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int a[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]!=nums[i] && nums[j]<nums[i])c+=1;
            }
            a[i]=c;
        }
        return a;
    }
}