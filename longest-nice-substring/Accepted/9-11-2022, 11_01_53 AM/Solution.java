// https://leetcode.com/problems/longest-nice-substring

class Solution {
    public String longestNiceSubstring(String s) {
        String st="",m="";int max=Integer.MIN_VALUE;
        outer:
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String sub=s.substring(i,j);
                //System.out.println(sub);
                if(sub.length()>1 && st.length()<s.length() && subs(sub)==true)st=sub;
                if(st.length()>max)
                {
                    max=st.length();
                    m=st;
                }
               
            }
        }
        return m;
    }
    public boolean subs(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            ch=(Character.isLowerCase(ch))?Character.toUpperCase(ch):Character.toLowerCase(ch);
            if(s.contains(Character.toString(ch))==false)return false;
        }
        return true;
    }
}