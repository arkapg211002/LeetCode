// https://leetcode.com/problems/score-after-flipping-matrix

class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0;i<n;i++){       // Flip all rows that start with zero
            if(grid[i][0] == 0)
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = 0;
            }
        }
        for(int i = 0;i<m;i++){       // Flip all columns where number of zeroes is greater than number of ones
            int count = 0;
            for(int j = 0;j<n;j++){
                if(grid[j][i] == 0)
                    count++;
            }
            if(count*2 > n){
                for(int j = 0;j<n;j++){
                    if(grid[j][i] == 0)
                        grid[j][i] = 1;
                    else
                        grid[j][i] = 0;
                }
            }
        }
        int sum=0;
        for(int i = 0;i<n;i++){     // Calculate the sum
            int p = 1;
            for(int j = m-1;j>=0;j--){
                sum += grid[i][j]*p;
                p *= 2;
            }
        }
        return sum;
    }
}