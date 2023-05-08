// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced

// first remove the balanced brackets and then swap the remaining unbalanced brackets
// Number of swaps for the remaining unbalanced brackets:
// 1) if even no. of ']' are there before '[' then then, No. of swaps = No. of ']' / 2 (becoz in one swap 2 ']' gets balanced)
// 2) same way for odd..... 

class Solution {
    public int minSwaps(String s) {
        int ans = 0 ;
        int o=0;
        for(char e: s.toCharArray()){
            if(e=='['){
                o++;
            }else if(e==']'){
                o--;
            }
            if(o<0){
                ans++;
                o=0;
            }
        }
        // System.out.println(ans);
        return (int)Math.ceil(ans/2.0);
    }
}