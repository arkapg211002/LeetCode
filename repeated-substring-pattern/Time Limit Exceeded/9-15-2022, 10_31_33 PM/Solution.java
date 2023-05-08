// https://leetcode.com/problems/repeated-substring-pattern

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String p="";
        for(int i=0;i<s.length()/2;i++)
        {
            p+=s.charAt(i);
            if(p.length()!=s.length() && s.replaceAll(p,"").equals("")==true)return true;
        }
        return false;
    }
}