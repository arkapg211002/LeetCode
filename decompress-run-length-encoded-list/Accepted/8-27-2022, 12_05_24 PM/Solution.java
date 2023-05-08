// https://leetcode.com/problems/decompress-run-length-encoded-list

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i+=2)
        {
            c+=nums[i];
            
        }
        int a[]=new int[c];int k=0;
        for(int i=0;i<nums.length;i+=2)
        {
            int freq=nums[i];
            int val=nums[i+1];
            for(int j=0;j<freq;j++)
            {
                a[k]=val;k++;
            }
        }
        return a;
    }
}