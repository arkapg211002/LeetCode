// https://leetcode.com/problems/build-array-from-permutation

class Solution {
    public int[] buildArray(int[] nums) {
        int a[]=nums;
        int b[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            b[i]=a[a[i]];
        }
        return b;
    }
}