// https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        if(Arrays.toString(target).equals(Arrays.toString(arr))==true)return true;
        else return false;
    }
}