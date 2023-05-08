// https://leetcode.com/problems/binary-search

class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1,m=0;
        while(l<=r)
        {
            m=(l+r)/2;
            if(target>nums[m])l=m+1;
            else if(target<nums[m])r=m-1;
            else if(target==nums[m])return m;
        }
        return -1;
    }
}