// https://leetcode.com/problems/to-lower-case

class Solution {
    public String toLowerCase(String s) {
        char ch='\u0000';String sb="";
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch))sb+=Character.toLowerCase(ch);
            else sb+=ch;
        }
        return sb;
    }
}