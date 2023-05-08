// https://leetcode.com/problems/word-pattern

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashSet<Character>p=new HashSet<>();
        HashSet<String>st=new HashSet<>();
        String sub[]=s.split(" ");
        for(int i=0;i<pattern.length();i++)
        {
            p.add(pattern.charAt(i));
        }
        for(int i=0;i<sub.length;i++)
        {
            st.add(sub[i]);
        }
        if(p.size()==st.size())return true;
        else return false;
    }
}