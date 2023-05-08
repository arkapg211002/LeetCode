// https://leetcode.com/problems/split-a-string-in-balanced-strings

class Solution {
    public int balancedStringSplit(String s) {
        //int c=0;String sub="";int j=0,cr=0,cl=0;;
        int c=0,cl=0,cr=0;
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='L')cl+=1;
           if(s.charAt(i)=='R')cr+=1;
           if(cl==cr)
           {
               c+=1;
               cl=0;
               cr=0;
           }
            else
            {
                continue;
            }
        }
        return c;
        
    }
   
}