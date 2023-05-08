// https://leetcode.com/problems/longest-continuous-increasing-subsequence

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int maxLen = 1, len =1;
        for(int i=1;i<nums.length;++i){
            if(nums[i-1]<nums[i])  len++;
            else{
                maxLen = Math.max(maxLen,len );
                len = 1;
            }
        }
        return  maxLen = Math.max(maxLen,len );
    }
}