// https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves

class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=3)return 0;
        Arrays.sort(nums);
        int d1=nums[nums.length-1-3]-nums[0];
        int d2=nums[nums.length-1]-nums[3];
        return Math.min(d1,d2);
    }
}