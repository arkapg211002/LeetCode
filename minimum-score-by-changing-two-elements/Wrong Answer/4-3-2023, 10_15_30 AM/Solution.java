// https://leetcode.com/problems/minimum-score-by-changing-two-elements

class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1]-nums[2];
    }
}