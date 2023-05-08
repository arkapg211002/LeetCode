// https://leetcode.com/problems/triangle

class Solution {
    public int minimumTotal(List<List<Integer>>l) {
        int n=l.size();
        int dp[][]=new int[n][n];
        for(int r[]:dp)Arrays.fill(r,-1);
        return f(0,0,l,n,dp);
    }
    public int f(int i,int j,List<List<Integer>>l,int n,int dp[][])
    {
        if(i==n-1)return l.get(i).get(j);
        if(dp[i][j]!=-1)return dp[i][j];
        int down=l.get(i).get(j)+f(i+1,j,l,n,dp);
        int diagonal=l.get(i).get(j)+f(i+1,j+1,l,n,dp);
        return dp[i][j]=(int)Math.min(down,diagonal);
    }
}