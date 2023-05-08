// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++)
        {
            String s[]=sentences[i].split(" ");
            int l=s.length;
            if(l>max)max=l;
            
        }
        return max;
    }
}