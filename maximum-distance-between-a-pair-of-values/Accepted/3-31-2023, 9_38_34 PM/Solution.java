// https://leetcode.com/problems/maximum-distance-between-a-pair-of-values

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0,j=0,ans=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]>nums2[j])i+=1;
            else
            {
                ans=Math.max(j-i,ans);
                j+=1;
            }
        }
        return ans;
    }
}