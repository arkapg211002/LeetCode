// https://leetcode.com/problems/next-greater-element-i

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    k=j;
                    break;
                }
            }
            if(k+1==nums2.length)nums1[i]=-1;
            for(int l=k+1;l<nums2.length;l++)
            {
                if(nums2[k]<=nums2[l])
                {
                    nums1[i]=nums2[l];
                    break;
                }
            }
        }
        return nums1;
    }
}