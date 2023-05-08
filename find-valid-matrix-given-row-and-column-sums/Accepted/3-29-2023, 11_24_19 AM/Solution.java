// https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int r=rowSum.length;
        int c=colSum.length;
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=(int)Math.min(rowSum[i],colSum[j]);
                rowSum[i]-=a[i][j];
                colSum[j]-=a[i][j];
            }
        }
        return a;
    }
}