// https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array

class Solution {
    public int minNumberOperations(int[] target) {
        int res = 0;
        int prev = 0;
        for (int cur : target) {
            if (cur > prev) {
                res += cur - prev;
            }
            prev = cur;
        }
        return res;
    }
}