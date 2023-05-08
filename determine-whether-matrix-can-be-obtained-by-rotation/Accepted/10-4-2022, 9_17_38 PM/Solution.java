// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int count = 0;
        while(count < 4){
            Rotate90(mat);
            boolean ans = false;
            int i=0,j=0;
            while(i < mat.length && j < mat[i].length){
                if(mat[i][j] != target[i][j]){
                    ans = false;
                    break;
                }else{
                    ans  = true;
                }
                j++;
                if(j == mat[i].length){
                    j = 0;
                    i++;
                }
            }
            if(ans){
                return ans;
            }
            count++;
        }
        return false;
    }
    void Rotate90(int[][] mat){
        Transpose(mat);
        int left = 0,right = mat.length-1;
        int i = 0;
        while(left < right){
            int tmp = mat[i][left];
            mat[i][left] = mat[i][right];
            mat[i][right] = tmp;
            i++;
            if(i == mat.length){
                i = 0;
                left++;
                right--;
            }
        }
    }
    void Transpose(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[i].length;j++){
                swap(mat,i,j);
            }
        }
    }
    void swap(int[][] mat,int i,int j){
        int tmp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = tmp;
    }
    
}