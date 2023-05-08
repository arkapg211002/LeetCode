// https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k

class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0,d=nums[0]+k;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=d)continue;
            else
            {
                c+=1;
                d=nums[i]+k;
                
            }
        }
        c+=1;
        return c;
    }
}