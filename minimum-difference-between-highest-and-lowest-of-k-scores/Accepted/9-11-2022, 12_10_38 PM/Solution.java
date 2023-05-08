// https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int i=k;
        while(i<=nums.length)
        {
            int h=nums[i-1];
            int l=nums[i-k];
            if(h-l<min)min=h-l;
            i+=1;
        }
        return min;
    }
}