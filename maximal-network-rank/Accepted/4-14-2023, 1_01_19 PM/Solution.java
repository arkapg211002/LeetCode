// https://leetcode.com/problems/maximal-network-rank

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int d[]=new int[n];
        int a[][]=new int[n][n],ans=0;
        for(int i=0;i<roads.length;i++)
        {
            d[roads[i][0]]+=1;
            d[roads[i][1]]+=1;
            a[roads[i][0]][roads[i][1]]=1;
            a[roads[i][1]][roads[i][0]]=1;
        }     
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i][j]==1)
                {
                    int rk=d[i]+d[j]-1;
                    ans=(int)Math.max(ans,rk);
                }
                else
                {
                    int rk=d[i]+d[j];
                    ans=(int)Math.max(ans,rk);
                }
            }
        }   
        return ans;
    }
}