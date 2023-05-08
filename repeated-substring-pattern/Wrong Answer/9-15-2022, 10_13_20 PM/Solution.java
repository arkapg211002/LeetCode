// https://leetcode.com/problems/repeated-substring-pattern

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String st=s;
        for(int i=0;i<s.length();i++)
        {
            String sub=s.substring(i+1);
            //System.out.println(sub);
            sub=sub.replaceAll(Character.toString(s.charAt(i)),"");
            //System.out.println(sub);
            s=s.substring(0,i+1)+sub;
        }
        //System.out.println(s);
        if(st.replaceAll(s,"").equals("")==true)return true;
        else return false;
        
    }
}