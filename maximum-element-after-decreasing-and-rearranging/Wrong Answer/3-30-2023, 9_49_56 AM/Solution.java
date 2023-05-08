// https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<arr.length;i++)h.add(arr[i]);
        return h.size();        
    }
}