// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length==1 || arr.length==2)return true;
        else if(arr[1]-arr[0]==arr[2]-arr[1])return true;
        else return false;
    }
}