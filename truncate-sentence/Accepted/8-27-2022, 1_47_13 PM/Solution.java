// https://leetcode.com/problems/truncate-sentence

class Solution {
    public String truncateSentence(String s, int k) {
        String str[]=s.split(" ");
        String sb="";
        for(int i=0;i<k;i++)
        {
            sb=sb+str[i]+" ";
        }
        sb=sb.trim();
        return sb;
    }
}