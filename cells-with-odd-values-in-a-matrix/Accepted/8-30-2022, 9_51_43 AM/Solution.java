// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=0;
            }
        }
        for(int i=0;i<indices.length;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[indices[i][0]][j]+=1;
            }
            for(int j=0;j<m;j++)
            {
                a[j][indices[i][1]]+=1;
            }
        }
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]%2!=0)c+=1;
            }
        }
        return c;
    }
}