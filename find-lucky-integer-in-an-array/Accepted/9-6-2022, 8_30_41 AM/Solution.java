// https://leetcode.com/problems/find-lucky-integer-in-an-array

class Solution {
    public int findLucky(int[] arr) {
        int luckyNo = -1;
        int[] nums = new int[501];
        
        for(int n: arr)
            nums[n]++;
        
        
        for(int i=1;i<=500;i++){
		
		//we have to find lucky no when count of the number is the same and we consider the highest if we have multiple such no's
            if(i == nums[i])
                luckyNo = i;
        }
        
        return luckyNo;
    }
}