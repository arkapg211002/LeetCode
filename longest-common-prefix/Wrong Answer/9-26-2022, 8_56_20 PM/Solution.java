// https://leetcode.com/problems/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        outer:
        for(int i=0;i<strs[0].length();i++)
        {
            s+=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].substring(0,s.length()).compareTo(s)!=0)break outer;
            }
        }
        if(s.length()==0)return s;
        else return s.substring(0,s.length()-1);
    }
}