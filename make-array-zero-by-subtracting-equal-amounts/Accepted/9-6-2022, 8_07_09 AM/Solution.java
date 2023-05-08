// https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts

class Solution {
    public int minimumOperations(int[] nums) {
        int[] count = new int[101];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        
        int uniqueNums = 0;
        for(int i=1;i<count.length;i++){
            if(count[i] != 0){
                uniqueNums++;
            }
        }
        return uniqueNums;
    }
}