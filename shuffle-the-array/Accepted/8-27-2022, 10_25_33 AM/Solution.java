// https://leetcode.com/problems/shuffle-the-array

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=0;
        int a[]=new int[2*n];
        for(int i=0;i<n;i++)
        {
            a[k]=nums[i];
            k+=1;
            a[k]=nums[n+i];
            k+=1;
        }
        return a;
    }
}