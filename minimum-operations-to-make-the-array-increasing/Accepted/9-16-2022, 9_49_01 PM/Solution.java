// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing

class Solution {
    public int minOperations(int[] nums) {
        int count =0;  // Operations Count
    int nextVal  = nums[0]+1;   // We choose the next value to be our successive element
    for(int i=1;i<nums.length;i++){
        
        if(nums[i]<=nums[i-1]){
            count += nextVal-nums[i];   // No. of operations to change the present value to the Next Succesor
            nums[i] = nextVal;  // change array value
        }
        else{
            nextVal = Math.max(nextVal,nums[i]); // Change the successor to the max value that can be put
        }
        nextVal++;  // for the array to be strictly increasing, always inc the nextVal ;
    }
    return count;
    }
}