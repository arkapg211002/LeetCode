// https://leetcode.com/problems/maximum-number-of-pairs-in-array

class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pairs = 0,leftover=0;
        if(nums.length==1) return new int[]{0,1};
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;){
            if(nums[i] == nums[i+1]){
                i+=2;
                pairs++;
            }
            else{
                i++;
                leftover++;
            }
             if(i==nums.length-1){
                    leftover++;
             }
        }
        return new int[]{pairs,leftover};
    }
}