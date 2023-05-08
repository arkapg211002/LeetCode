// https://leetcode.com/problems/rotate-image

class Solution {
    public void rotate(int[][] matrix) {
        int num= matrix.length;
        int[][] a= new int[num][num];
        for(int i=num-1;i>=0;i--){
            for(int j=0;j<num;j++){
                a[j][num-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                matrix[i][j]=a[i][j];
            }
        }
    }
}