// https://leetcode.com/problems/number-of-islands

class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int v[][]=new int[n][m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && v[i][j]==0)
                {
                    count+=1;
                    dfs(i,j,grid,v,n,m);
                }
            }
        }
        return count;
    }
    public void dfs(int r,int c,char g[][],int v[][],int n,int m)
    {
        v[r][c]=1;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        for(int i=0;i<4;i++)
        {
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && g[nr][nc]=='1' && v[nr][nc]==0)
            {
                dfs(nr,nc,g,v,n,m);
            }
        }
    }
}