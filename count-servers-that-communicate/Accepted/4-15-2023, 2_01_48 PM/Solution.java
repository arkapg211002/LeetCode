// https://leetcode.com/problems/count-servers-that-communicate

class Solution {
    public int countServers(int[][] grid) {
        //if(grid == null || grid.length ==0)return 0;
        int n=grid.length,m=grid[0].length,r[]=new int[n],c[]=new int[m],s=0;
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<m;j++) 
            {
                if(grid[i][j] ==1)
                {
                    s+=1;
                    r[i]+=1;
                    c[j]+=1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                if(grid[i][j]==1 && r[i]==1 && c[j]==1)s-=1;
        }   
        return s;
    }
}