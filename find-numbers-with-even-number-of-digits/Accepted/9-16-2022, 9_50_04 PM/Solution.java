// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
    for(int i: nums){
        String s = Integer.toString(i);
        if(s.length() % 2 == 0)
            ans++;
    }        
    
    return ans;   
    }
}