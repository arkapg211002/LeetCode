// https://leetcode.com/problems/di-string-match

class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int k=0;
        int p[]=new int[n+1];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                p[i]=k;
                k++;
            }
            else
            {
                p[i]=n;
                n--;
            }
        }
        if(s.charAt(s.length()-1)=='I')p[s.length()]=k;
        else p[s.length()]=n;
        return p;
    }
}