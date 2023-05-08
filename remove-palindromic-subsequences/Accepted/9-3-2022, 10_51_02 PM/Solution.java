// https://leetcode.com/problems/remove-palindromic-subsequences

class Solution {
    public int removePalindromeSub(String s) {
        return ((s.equals(new StringBuilder(s).reverse().toString())==true)?1:2);
        
        
    }
}