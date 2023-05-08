// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        //int flag=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==')' && (s.charAt(i-1)=='[' || s.charAt(i-1)=='{'))
            {
               return false;
            }
            if(s.charAt(i)=='}' && (s.charAt(i-1)=='(' || s.charAt(i-1)=='['))
            {
               return false;
            }
            if(s.charAt(i)==']' && (s.charAt(i-1)=='(' || s.charAt(i-1)=='{'))
            {
               return false;
            }
        }
        return true;
    }
}