// https://leetcode.com/problems/smallest-range-i

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int l=nums[0];
        int r=nums[nums.length-1];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=k;i++)
        {
            for(int j=0;j<=k;j++)
            {
                int m=(r-j)-(l+i);
                if(m<=min && m>=0)min=m;
            }
        }
        return min;
    }
}