// https://leetcode.com/problems/removing-minimum-and-maximum-from-array

class Solution {
    public int minimumDeletions(int[] nums) {
        
        int n = nums.length;
        if(n==1) return 1;
        
        int minId = 0, maxId = 0;
		
        // first find max & min element index        
        for(int i=0; i<n; i++){
            if(nums[i] > nums[maxId])
                maxId = i;
            if(nums[i] < nums[minId])
                minId = i;
        }
        
        int numOfDelFromLeft = Math.max(maxId, minId) + 1;
        int numOfDelFromRight = n - Math.min(maxId, minId);
        int numOfDelFromLeftAndRight = (Math.min(maxId, minId) + 1) + (n - Math.max(maxId, minId)) ;
        
        return Math.min(numOfDelFromLeftAndRight , ( Math.min(numOfDelFromLeft, numOfDelFromRight) ));
    }
}