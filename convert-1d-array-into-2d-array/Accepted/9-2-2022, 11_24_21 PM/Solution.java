// https://leetcode.com/problems/convert-1d-array-into-2d-array

class Solution {
    public int[][] construct2DArray(int[] f, int m, int n) {
        if(f.length != m*n) return new int[0][0];
        
        int[][] ans=new int[m][n];
        
        int x=0,y=0;
        for(int i=0;i<f.length;i++){
            ans[x][y]=f[i];
            y++;
            if(y==n)
            {
                y=0;
                x++;
            }
        }
        return ans;
    }
}