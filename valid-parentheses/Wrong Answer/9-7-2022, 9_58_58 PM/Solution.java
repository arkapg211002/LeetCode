// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        int a=0,b=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')a+=1;
            else if(s.charAt(i)==')')a-=1;
            if(s.charAt(i)=='{')b+=1;
            else if(s.charAt(i)=='}')b-=1;
            if(s.charAt(i)=='[')c+=1;
            else if(s.charAt(i)==']')c-=1;
        }
        if(a==0 && b==0 && c==0)return true;
        else return false;
    }
}