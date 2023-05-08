// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')st.push(s.charAt(i));
            if(s.charAt(i)==')' && st.isEmpty()==false && st.peek()=='(')st.pop();
            else if(s.charAt(i)=='}' && st.isEmpty()==false && st.peek()=='{')st.pop();
            else if(s.charAt(i)==']' && st.isEmpty()==false && st.peek()=='[')st.pop();
        }
        if(st.isEmpty()==true)return true;
        else return false;
    }
}