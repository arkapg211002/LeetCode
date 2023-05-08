// https://leetcode.com/problems/largest-local-values-in-a-matrix

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int l[][]=new int[n-2][n-2];
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<n-2;j++)
            {
                l[i][j]=local(grid,i,j);
            }
        }
        return l;
    }
    public int local(int g[][],int x,int y)
    {
        int max=Integer.MIN_VALUE;
        for(int i=x;i<x+3;i++)
        {
            for(int j=y;j<y+3;j++)
            {
                if(g[i][j]>=max)max=g[i][j];
            }
        }
        return max;
    }
}