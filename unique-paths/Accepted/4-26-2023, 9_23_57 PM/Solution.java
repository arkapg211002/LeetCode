// https://leetcode.com/problems/unique-paths

class Solution {
    public int uniquePaths(int m, int n) {
        int prev[]=new int[n];
        for(int i=0;i<m;i++)
        {
            int cur[]=new int[n];
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0)
                {
                    cur[j]=1;
                    continue;
                }
                int up=0;
                if(i>0)up=prev[j];
                int left=0;
                if(j>0)left=cur[j-1];
                cur[j]=up + left;
            }
            prev=cur;
        }
        return prev[n-1];
    }

}


/*class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 && j==0)
                {
                    dp[i][j]=1;
                    continue;
                }
                int up=0;
                if(i>0)up=dp[i-1][j];
                int left=0;
                if(j>0)left=dp[i][j-1];
                dp[i][j]=up + left;
            }
        }
        return dp[n-1][m-1];
    }

}
*/