// https://leetcode.com/problems/longest-common-prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        outer:
        for(int i=0;i<strs[0].length();i++)
        {
            for(int j=0;j<strs.length;j++)
            {
               /* if(strs[j].equals("")==true || strs[j].length()<s.length() || strs[j].charAt(i)!=strs[0].charAt(i))break outer;*/
                if(strs[j].equals("")==true)break outer;
                else if(strs[j].length()<(s+strs[0].charAt(i)).length())break outer;
                else if(strs[j].charAt(i)!=strs[0].charAt(i))break outer;
            }
            s+=strs[0].charAt(i);
        }
        return s;
    }
}