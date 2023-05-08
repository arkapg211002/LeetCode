// https://leetcode.com/problems/count-square-submatrices-with-all-ones

class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length,s=0,a[][]=new int[m][n];
        for(int i=0;i<m;i++)a[i][0]=matrix[i][0];
        for(int j=0;j<n;j++)a[0][j]=matrix[0][j];
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]!=0)
                {
                    int min=(int)Math.min(a[i-1][j],a[i][j-1]);
                    min=(int)Math.min(min,a[i-1][j-1]);
                    a[i][j]=min+1;
                }
                else a[i][j]=0;
            }
        }
        for(int r[]:a)s+=Arrays.stream(r).sum();
        return s;
    }
}