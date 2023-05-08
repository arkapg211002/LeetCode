// https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int h=nums[nums.length-1];
        int l=nums[nums.length-k];
        return (h-l);
    }
}