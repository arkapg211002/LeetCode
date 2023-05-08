// https://leetcode.com/problems/valid-mountain-array

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3){
            return false;
        }
        int i  = -1;
        
        for (int j = 0; j < arr.length-1 && i == -1; j++){
            if (arr[j] == arr[j+1]){
                return false;
            } else if (arr[j] > arr[j+1]){
                i = j;
            }
        }
        
        if (i == -1 || i == 0) {
            return false;
        }
        
        for (int j = i; j < arr.length-1 ; j++){
            if (arr[j] <= arr[j+1]){
                return false;
            }
        }
        
        return true;
    }
}