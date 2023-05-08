// https://leetcode.com/problems/island-perimeter

class Solution {
    public int islandPerimeter(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    c+=4;
                    if(j>0 && grid[i][j-1]==1)c-=2;
                    if(i>0 && grid[i-1][j]==1)c-=2;
                }
            }
        }
        return c;
    }
}