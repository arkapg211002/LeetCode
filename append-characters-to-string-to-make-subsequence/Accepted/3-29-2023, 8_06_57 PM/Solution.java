// https://leetcode.com/problems/append-characters-to-string-to-make-subsequence

class Solution {
    public int appendCharacters(String s, String t) {
        
        int idx = 0;
        
        for(int i = 0;i<s.length();)
        {
            while(idx<t.length() && i<s.length() && s.charAt(i) == t.charAt(idx))
            {
                idx++;
                i++;
            }
            i++;
        }
        
        return t.length() - idx;
        
    }
}