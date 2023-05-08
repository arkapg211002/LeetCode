// https://leetcode.com/problems/arranging-coins

class Solution {
    public int arrangeCoins(int n) {
        long  start  = 1;
        long  end = n;
        long  ans = 0;
         while (start <= end) {
            long mid = start + (end - start) / 2;
            // formula for finding sum of n natural numbers  sum = n*(n+1)/2
            long filledCoins = mid * (mid + 1) / 2;
            
            if (filledCoins == n) {
                return (int) mid;
            }
            if (filledCoins < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
}