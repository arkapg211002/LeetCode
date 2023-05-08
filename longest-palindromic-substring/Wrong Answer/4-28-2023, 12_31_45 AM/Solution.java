// https://leetcode.com/problems/longest-palindromic-substring

class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String s2=new StringBuilder(s).reverse().toString();
        int dp[][]=new int[n+1][n+1];
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s.charAt(i-1)==s2.charAt(j-1))
                {
                    int val=dp[i][j]=dp[i-1][j-1]+1;;
                    dp[i][j]=val;
                    ans=(int)Math.max(ans,val);
                }
                else dp[i][j]=0;
            }
        }
        /*System.out.println(ans);
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }*/

        String p="";
        for(int i=1;i<=n;i++)
        {
            if(dp[i][i]!=0 && dp[i][i]==dp[i-1][i-1]+1)
                p+=s.charAt(i-1);
        }
        return p;
    }
}