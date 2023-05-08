// https://leetcode.com/problems/maximum-average-subarray-i

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Double.MIN_VALUE;
        int i=k;
        while(i<=nums.length)
        {
            int s=0;
            for(int j=i-k;j<i;j++)
            {
                s+=nums[j];
            }
            double avg=(s*0.1)/(k*0.1);
            if(avg>max)max=avg;
            i+=1;
        }
        return max;
    }
}