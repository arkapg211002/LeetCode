// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int m=nums[nums.length-1];
        int c=0;
        int n=0;
        while(n<=m)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>=n)c+=1;
            }
            if(n==c)return c;
            n+=1;
            c=0;
        }
        return -1;
    }
}