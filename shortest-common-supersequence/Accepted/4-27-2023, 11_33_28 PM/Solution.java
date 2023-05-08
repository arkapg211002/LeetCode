// https://leetcode.com/problems/shortest-common-supersequence

class Solution {
    public String shortestCommonSupersequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=(int)Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int len=dp[n][m];
        int index=len-1;
        int i=n,j=m;
        String s="";
        while(i>0 && j>0)
        {
            if(text1.charAt(i-1)==text2.charAt(j-1))
            {
                s+=text1.charAt(i-1);
                i-=1;
                j-=1;
                index-=1;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                s+=text1.charAt(i-1);
                i-=1;
            }
            else
            {
                s+=text2.charAt(j-1);
                j-=1;
            }
        }
        while(i>0)
        {
            s += text1.charAt(i-1);
            i--;
        }
        while(j>0)
        {
            s += text2.charAt(j-1);
            j--;
        }
        return new StringBuilder(s).reverse().toString();

    }
}