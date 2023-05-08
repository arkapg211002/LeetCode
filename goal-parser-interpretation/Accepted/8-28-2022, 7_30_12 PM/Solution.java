// https://leetcode.com/problems/goal-parser-interpretation

class Solution {
    public String interpret(String command) {
        String s="",p="";
        char ch='\u0000';
        for(int i=0;i<command.length();i++)
        {
            ch=command.charAt(i);
            p=p+ch;
            if(ch=='G')
            {
                s=s+ch;p="";
            }
            if(p.equals("()")==true)
            {
                s=s+"o";p="";
            }
            if(p.equals("(al)")==true)
            {
                s=s+"al";
                p="";
            }
        }
        return s;
    }
}