// https://leetcode.com/problems/minimum-elements-to-add-to-form-a-given-sum

class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        
        long s=0;
        for(int i=0;i<nums.length;i++)s+=(long)nums[i];
        return (int)(Math.ceil(Math.abs((long)goal-s)*1.0/limit));
    }
}