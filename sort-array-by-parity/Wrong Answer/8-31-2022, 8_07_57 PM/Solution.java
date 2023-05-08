// https://leetcode.com/problems/sort-array-by-parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int a[]=new int[nums.length];
        int k=0;
        for(int i=1;i<nums.length;i+=2)
        {
            a[k]=nums[i];
            k+=1;
        }
        for(int i=0;i<nums.length;i+=2)
        {
            a[k]=nums[i];
            k+=1;
        }
        return a;
    }
}