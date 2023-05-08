// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
        int front = 0;
    int count = 0;
	// if array have only one element
    if(nums.length<1)
        return 0;
    for(int i = 0 ; i<nums.length; i++)
    {
        if(nums[i]>nums[front])
        {
            nums[front+1] = nums[i];
            count++;
            front++;
        }
    }
    return count+1;
    }
}