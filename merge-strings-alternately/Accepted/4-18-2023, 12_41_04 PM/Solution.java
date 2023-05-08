// https://leetcode.com/problems/merge-strings-alternately

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int w1=0,w2=0;
        if(word1.equals("")==true)return word2;
        else if(word2.equals("")==true)return word1;
        for(int i=0;i<word1.length()+word2.length();i++)
        {
            if(w1>=word1.length())
            {
                sb.append(word2.charAt(w2));
                w2++;
            }
            else if(w2>=word2.length())
            {
                sb.append(word1.charAt(w1));
                w1++;
            }
            else if(i%2==0)
            {
                sb.append(word1.charAt(w1));
                w1++;
            }
            else if(i%2!=0)
            {
                sb.append(word2.charAt(w2));
                w2++;
            }
            
        }
        return sb.toString();
    }
}