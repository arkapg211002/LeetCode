// https://leetcode.com/problems/longest-palindromic-substring

class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String s2=new StringBuilder(s).reverse().toString();
        int dp[][]=new int[n+1][n+1];
        int ans=0,start=-1,end=-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s.charAt(i-1)==s2.charAt(j-1))
                {
                    int val=dp[i][j]=dp[i-1][j-1]+1;;
                    dp[i][j]=val;
                    if (val > ans) 
                    { 
                        ans = val;
                        start = i;
                        end = j;
                    }
                }
                else dp[i][j]=0;
            }
        }
        if (ans == 0)return ""; 
        StringBuilder sb = new StringBuilder();
        for (int i = start - ans; i < end; i++) 
            sb.append(s.charAt(i));
    
        return sb.toString();    

        
        
    }
}