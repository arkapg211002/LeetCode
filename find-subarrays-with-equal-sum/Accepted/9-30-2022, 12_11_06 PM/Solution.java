// https://leetcode.com/problems/find-subarrays-with-equal-sum

class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int i=1;i<nums.length;i++)
        {
            h.add(nums[i]+nums[i-1]);
        }
        if(h.size()<nums.length-1)return true;
        else return false;
    }
}