// https://leetcode.com/problems/delete-operation-for-two-strings

class Solution {
    public int minDistance(String word1, String word2) {
        int k=lcs(word1,word2);
        return ((word1.length()-k)+(word2.length()-k));
    }
    public int lcs(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int prev[]=new int[m+1];
        int cur[]=new int[m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))cur[j]=1+prev[j-1];
                else cur[j]=0+(int)Math.max(prev[j],cur[j-1]);
            }
            prev=(int[])(cur.clone());
        }
        return prev[m];
    }
}