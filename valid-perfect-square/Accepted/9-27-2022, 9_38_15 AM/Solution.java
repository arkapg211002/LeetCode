// https://leetcode.com/problems/valid-perfect-square

class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        
        while(low<=high){
			//long mid because if it is integer mid*mid generate unexpected result
            long mid = low + (high - low)/2;
            
            if(mid*mid > num)
                high = (int)mid-1;
            else if(mid*mid < num)
                low = (int)mid+1;
            else 
                return true;
        }
        return false;
    }
}