// https://leetcode.com/problems/break-a-palindrome

class Solution {
    public String breakPalindrome(String palindrome) {
        
         if (palindrome.length() == 1){   //single character cannot me changed to non-palindrome
             return "";
         }
		 
        char[] chars = palindrome.toCharArray();
       
        //we know that input string is palindrom so travel only half string
        for (int i = 0; i < chars.length/2; i++) {         
            if (chars[i] != 'a') {
                chars[i] = 'a';
                return new String(chars);
            }
        }
        
        //string is having all 'a' so make last charscter as 'b'       
        chars[chars.length-1] = 'b';        
        return new String(chars);           
    }
}