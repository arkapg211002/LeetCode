// https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m=nums1.length,n=nums2.length;
        int i=0,j=0,c=0;
        while(i<m && j<n)
        {
            if(nums1[i][0]==nums2[j][0])
            {
                c++;
                i++;
                j++;
            }
            else if(nums1[i][0]>nums2[j][0])
            {
                c++;
                j++;
            }
            else
            {
                c++;
                i++;
            }
        }
        while(i<m)
        {
            c++;
            i++;
        }
        while(j<n)
        {
            c++;
            j++;
        }
        int nums[][] = new int[c][2];
        int k=0;
        i=0;
        j=0;
        while(i<m && j<n)
        {
            if(nums1[i][0]==nums2[j][0])
            {
                nums[k][0]=nums1[i][0];
                nums[k][1]=nums1[i][1]+nums2[j][1];
                k++;
                i++;
                j++;
            }
            else if(nums1[i][0]>nums2[j][0])
            {
                nums[k][0]=nums2[j][0];
                nums[k][1]=nums2[j][1];
                k++;
                j++;
            }
            else
            {
                nums[k][0]=nums1[i][0];
                nums[k][1]=nums1[i][1];
                k++;
                i++;
            }
        }
        while(i<m)
        {
            nums[k][0]=nums1[i][0];
                nums[k][1]=nums1[i][1];
                k++;
                i++;
        }
        while(j<n)
        {
           nums[k][0]=nums2[j][0];
                nums[k][1]=nums2[j][1];
                k++;
                j++;
        }
        return nums;
    }
}