// https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int a[][]=new int[rowSum.length][colSum.length];
        int n=(int)Math.min(rowSum.length,colSum.length);
        int rs=rowSum.length;
        int cs=colSum.length;
        if(rs==1 && cs==1)
        {
            a[0][0]=rowSum[0];
            return a;
        }
        if(rs==1 && cs==2)
        {
            a[0][0]=colSum[0];
            a[0][1]=colSum[1];
            return a;
        }
        if(rs==2 && cs==1)
        {
            a[0][0]=rowSum[0];
            a[1][0]=rowSum[1];
            return a;
        }
        for(int i=0;i<n;i++)
        {
            if(i-1<0 && i+1<n)
            {
                a[i][i]=rowSum[i];
                a[i+1][i]=colSum[i]-a[i][i];
            }
            else if(i-1>=0 && i+1<n)
            {
                a[i][i]=rowSum[i]-a[i][i-1];
                a[i+1][i]=colSum[i]-a[i][i];
            }
            else if(i-1>=0 && i+1>=n)
            {
                if(rowSum[i]-a[i-1][i]<=colSum[i])
                    a[i][i]=rowSum[i]-a[i-1][i];
                else
                    a[i][i]=colSum[i];
            }
        }
        if(rs>cs)a[rs-1][cs-1]=rowSum[rs-1];
        else a[rs-1][cs-1]=colSum[cs-1];
        return a;
    }
}