// https://leetcode.com/problems/third-maximum-number

class Solution {
    public int thirdMax(int[] nums) {
        Set <Integer> ele = new HashSet<>();

         for(int num : nums){
          ele.add(num);
         }

         if(ele.size() == 1){
          return nums[0];
         }

         if(ele.size() == 2){
          return Collections.max(ele);
         }

         ele.remove(Collections.max(ele));
         ele.remove(Collections.max(ele));
      
         return (Collections.max(ele));   
    }
}