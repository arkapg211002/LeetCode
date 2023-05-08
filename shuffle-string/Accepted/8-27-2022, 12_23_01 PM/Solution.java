// https://leetcode.com/problems/shuffle-string

class Solution {
    public String restoreString(String s, int[] indices) {
        char str[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            int a=indices[i];
            str[a]=s.charAt(i);
        }
        String sb="";
        for(int i=0;i<s.length();i++)
        {
            sb+=str[i];
        }
        return sb;
    }
}