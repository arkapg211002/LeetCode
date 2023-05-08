// https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves

class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=3)return 0;
        Arrays.sort(nums);
        int d1=nums[nums.length-1-3]-nums[0];
        int d2=nums[nums.length-1]-nums[3];
        int d3=nums[nums.length-1-1]-nums[2];
        int d4=nums[nums.length-1-2]-nums[1];
        return Math.min(Math.min(d1,d2),Math.min(d3,d4));
    }
}