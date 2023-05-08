// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int a : nums){
            if(i ==0 || i ==1|| nums[i-2] != a){
                nums[i] = a;
                i++;
            }
        
        }
        return i;
    }
}