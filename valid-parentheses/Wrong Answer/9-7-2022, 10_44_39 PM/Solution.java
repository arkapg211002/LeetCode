// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        int flag=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=')' || s.charAt(i-1)!=']' || s.charAt(i-1)!='}')flag=1;
           if(s.charAt(i)==')' || s.charAt(i-1)==']' || s.charAt(i-1)=='}')flag=0;
            if(s.charAt(i)==')' && (s.charAt(i-1)=='[' || s.charAt(i-1)=='{'))
            {
               flag=1;
            }
            else if(s.charAt(i)=='}' && (s.charAt(i-1)=='(' || s.charAt(i-1)=='['))
            {
               flag=1;
            }
            else if(s.charAt(i)==']' && (s.charAt(i-1)=='(' || s.charAt(i-1)=='{'))
            {
               flag=1;
            }
            else flag=0;
        }
        if(flag==1)return false;
        else return true;
    }
}