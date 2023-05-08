// https://leetcode.com/problems/perfect-number

class Solution {
    public boolean checkPerfectNumber(int num) {
        
        if(num == 1) return false;
        
        int sum = 1;
        
        for(int i = (int)Math.sqrt(num) ; sum<=num && i>=2; --i){
            if(num%i == 0)   sum = sum + i + num/i;
        }
        
        if(sum != num) return false;
        
        return true;
        
    }
}