// https://leetcode.com/problems/sorting-the-sentence

class Solution {
    public String sortSentence(String s) {
        String sb[]=s.split(" ");
        String str[]=new String[sb.length];
        String a="";
        for(int i=0;i<sb.length;i++)
        {
            a=sb[i].substring(0,sb[i].length()-1);
            int b=Integer.parseInt(sb[i].substring(sb[i].length()-1));
            str[b-1]=a;
        }
        s="";
        for(int i=0;i<sb.length;i++)
        {
            s+=str[i]+" ";
        }
        s=s.trim();
        return s;
    }
}