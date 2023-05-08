// https://leetcode.com/problems/maximum-average-subarray-i

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        List<Double>l=new ArrayList<>();
        int i=k;
        while(i<=nums.length)
        {
            double s=0;
            for(int j=i-k;j<i;j++)
            {
                s+=(double)nums[j];
            }
            l.add(s/k);
            i+=1;
        }
        Collections.sort(l);
        return l.get(l.size()-1);
       
    }
}