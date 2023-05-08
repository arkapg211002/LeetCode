// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        //if(arr.length==1 || arr.length==2)return true;
        if(arr[0]+(arr.length-1)*(arr[1]-arr[0])==arr[arr.length-1])return true;
        else return false;
    }
}