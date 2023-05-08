// https://leetcode.com/problems/minimum-score-by-changing-two-elements

class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int d1=(nums[nums.length-1]-nums[2]);
        int d2=(nums[nums.length-1-2]-nums[0]);
        int d3=(nums[nums.length-1-1]-nums[1]);
        return (int)(Math.min(d1,Math.min(d2,d3)));
    }
}