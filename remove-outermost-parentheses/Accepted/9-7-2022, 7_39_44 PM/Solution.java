// https://leetcode.com/problems/remove-outermost-parentheses

class Solution {
    public String removeOuterParentheses(String s) {
        int l=0;
        String p="";
        String str="";
        for(int i=0;i<=s.length();i++)
        {
           if(l==0 && p.length()!=0)
           {
               p=p.substring(1,p.length()-1);
               str+=p;
               p="";
               
           }
            if(i==s.length())break;
           p+=s.charAt(i);
            //System.out.print(s.charAt(i));
           if(s.charAt(i)=='(')l+=1;
           else l-=1;
            //System.out.println(l);
            
            
        }
        return str;
    }
}