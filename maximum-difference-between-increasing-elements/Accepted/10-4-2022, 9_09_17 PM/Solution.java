// https://leetcode.com/problems/maximum-difference-between-increasing-elements

class Solution {
    public int maximumDifference(int[] nums) {
        
     int least= Integer.MAX_VALUE;
      int rightnow=0;
        int maxin=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<least)
                least=nums[i];
            rightnow=nums[i]-least;
            
            if(maxin<rightnow && rightnow!=0)
                maxin=rightnow;
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
   return maxin; }
}