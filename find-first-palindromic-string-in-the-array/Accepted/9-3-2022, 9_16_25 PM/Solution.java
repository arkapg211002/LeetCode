// https://leetcode.com/problems/find-first-palindromic-string-in-the-array

class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(words[i].compareTo(new StringBuilder(words[i]).reverse().toString())==0){
                return words[i];
            }
        }
        return "";
    }
}