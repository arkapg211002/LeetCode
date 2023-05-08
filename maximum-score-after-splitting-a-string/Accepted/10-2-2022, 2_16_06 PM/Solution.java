// https://leetcode.com/problems/maximum-score-after-splitting-a-string

class Solution {
    public int maxScore(String s) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length() - 1; i++){
            String left = s.substring(0, i+1);
            String right = s.substring(i+1);
            int sum = (helper(left, '0') + helper(right, '1'));
            max = Integer.max(max, sum);
        }
        return max;
    }

    private static int helper(String str, char i) {
        int count = 0;

        for (char c : str.toCharArray()){
            if (c == i) count++;
        }
        return count;
    }
}