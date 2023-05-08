// https://leetcode.com/problems/make-the-string-great

class Solution {
    public String makeGood(String s) {
        String p=s;
        p=p.toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        while(i<sb.length()-1)
        {
            if(Character.toString(sb.charAt(i)).equalsIgnoreCase(Character.toString(sb.charAt(i+1)))==true)
            {
                if(Character.isLowerCase(sb.charAt(i))==true && Character.isUpperCase(sb.charAt(i+1))==true){sb=sb.delete(i,i+2);i=0;}
                else if(Character.isLowerCase(sb.charAt(i+1))==true && Character.isUpperCase(sb.charAt(i))==true){sb=sb.delete(i,i+2);i=0;}
            }
            else i+=1;;
        }
        return sb.toString();
    }
}