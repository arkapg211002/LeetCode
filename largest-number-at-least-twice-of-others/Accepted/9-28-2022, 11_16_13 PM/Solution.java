// https://leetcode.com/problems/largest-number-at-least-twice-of-others

class Solution {
    public int dominantIndex(int[] nums) {
        int count=0;
        int max=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(max==nums[i])continue;
            else if(max>=2*nums[i]){
                count++;
            }else if(2*nums[i]>max){
                return -1;
            }
        }
     return index;
    }
}