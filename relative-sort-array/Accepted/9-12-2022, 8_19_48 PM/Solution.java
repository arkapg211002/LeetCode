// https://leetcode.com/problems/relative-sort-array

class Solution {
public int[] relativeSortArray(int[] arr1, int[] arr2) {

    int i = 0;
    int k = 0;
    while (i < arr2.length){
        for (int j = 0; j < arr1.length; j++){
            if (arr2[i]==arr1[j]){
                swap(arr1,j,k);
                k++;
            }
        }
        i++;
    }
    Arrays.sort(arr1,k,arr1.length);
    return arr1;
}


public void swap(int[] arr, int i, int j){
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
}
}