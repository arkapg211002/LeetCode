// https://leetcode.com/problems/concatenation-of-array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=nums[i];
        }
        int k=0;
        for(int j=nums.length;j<2*nums.length;j++)
        {
            a[j]=nums[k];k++;
        }
        return a;
    }
}