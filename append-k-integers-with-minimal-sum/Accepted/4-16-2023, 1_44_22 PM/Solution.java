// https://leetcode.com/problems/append-k-integers-with-minimal-sum

class Solution {
        public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long ans = 0, lo = 1;
        for (int num : nums) {
            if (num > lo) {
                long hi = Math.min(num - 1, lo + k - 1);
                int cnt = (int)(hi - lo + 1);
                ans += (lo + hi) * cnt / 2;
                k -= cnt;
                if (k == 0) {
                    return ans;
                }
            } 
            lo = num + 1;
        }
        if (k > 0) {
            ans += (lo + lo + k - 1) * k / 2;
        }
        return ans;
    }
}