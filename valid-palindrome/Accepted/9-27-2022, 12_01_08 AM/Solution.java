// https://leetcode.com/problems/valid-palindrome

class Solution {
    public boolean isPalindrome(String s) {
        String a = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                a+=c;
            }
            
        }
        a = a.toLowerCase();
        
        int start = 0;
        int end = a.length()-1;
        while(start <= end){
            if(a.charAt(start) != a.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}