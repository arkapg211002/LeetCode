// https://leetcode.com/problems/next-greater-element-i

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        outer:
        for(int i=0;i<nums1.length;i++)
        {
            
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j] && j+1==nums2.length)nums1[i]=-1;
                else if(nums1[i]==nums2[j] && nums2[j]<=nums2[j+1])
                {
                    nums1[i]=nums2[j+1];
                    continue outer;
                }
                 
                
            }
            nums1[i]=-1;
        }
        return nums1;
    }
}