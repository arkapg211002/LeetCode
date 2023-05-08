// https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
            while(arr[i+1]-arr[i]>1)arr[i+1]-=1;
        return arr[arr.length-1];
    }
}