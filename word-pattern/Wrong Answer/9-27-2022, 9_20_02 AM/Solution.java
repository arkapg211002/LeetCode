// https://leetcode.com/problems/word-pattern

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String sub[]=s.split(" ");
        if(sub.length!=pattern.length())return false;
        HashSet<Character>p=new HashSet<>();
        HashSet<String>st=new HashSet<>();
        for(int i=0;i<pattern.length();i++)
        {
            p.add(pattern.charAt(i));
            st.add(sub[i]);
        }
        if(p.size()==st.size())return true;
        else return false;
    }
}