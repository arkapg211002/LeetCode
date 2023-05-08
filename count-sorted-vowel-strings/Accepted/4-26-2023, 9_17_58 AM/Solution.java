// https://leetcode.com/problems/count-sorted-vowel-strings

class Solution {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n + 1][6];
        for(int[] row : dp) Arrays.fill(row, -1);
        
        String s = "aeiou";
        return solve(s.length(), 0, n, dp);
    }
    
    private int solve(int s, int index, int n, int[][] dp){
        if(n == 0) return 1;
        if(dp[n][index] != -1) return dp[n][index];
        int result = 0;
        
        for(int i = index; i < s; i++){
            result += solve(s, i, n - 1, dp);
        }
        
        return dp[n][index] = result;
    }
    
}