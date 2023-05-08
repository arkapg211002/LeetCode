// https://leetcode.com/problems/repeated-substring-pattern

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb=new StringBuilder(s).append(s);
        String st=sb.deleteCharAt(0).deleteCharAt(sb.length()-1).toString();
        if(st.contains(s)==true)return true;
        else return false;        
    }
}