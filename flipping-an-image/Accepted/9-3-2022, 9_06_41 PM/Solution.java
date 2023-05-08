// https://leetcode.com/problems/flipping-an-image

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int f[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++)
        {
            for(int j=image[0].length-1;j>=0;j--)
            {
                f[i][j]=image[i][image[0].length-1-j];
                if(f[i][j]==1)f[i][j]=0;
                else f[i][j]=1;
            }
        }
        return f;
        
    }
}