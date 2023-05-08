// https://leetcode.com/problems/max-increase-to-keep-city-skyline

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int a[][]=new int[grid.length][grid.length];
        int mr,mc,d=0,s=0;
        for(int i=0;i<grid.length;i++)
        {
            mr=0;
            for(int j=0;j<grid.length;j++)
            {
                mr=(int)Math.max(mr,grid[i][j]);
            }
            for(int j=0;j<grid.length;j++)
            {
               mc=0;
               for(int k=0;k<grid.length;k++)
               {
                   mc=(int)Math.max(mc,grid[k][j]);
               }
               d=(int)Math.min(mr,mc);
               s+=(d-grid[i][j]);
            }
            
        }
        return s;
    }
}