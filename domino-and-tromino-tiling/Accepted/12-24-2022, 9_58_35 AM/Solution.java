// https://leetcode.com/problems/domino-and-tromino-tiling

class Solution {

// There is probably a symmetry argument to make it faster, but I haven't done that.
// And I think I have over-modded just to be careful :)
    
    int MOD = 1_000_000_007;
    Integer[][] dp;
    public int numTilings(int N) {
        dp = new Integer[1_001][1_001];
        return helper(N, 0, 0);
    }
    
    private int helper(int N, int upper, int lower) {
        if (upper > N || lower > N) {
            return 0;
        }
        if (upper == N && lower == N) {
            return 1;
        }
        
        if (dp[upper][lower] != null) {
            return dp[upper][lower];
        }
        
        int count = 0;
        if (upper == lower) {
            count = (count + helper(N, upper + 1, lower + 1)) % MOD;
            count = (count + helper(N, upper + 2, lower)) % MOD;
            // count += helper(N, upper, lower + 2); Don't count this one.
            
            count = (count + helper(N, upper + 1, lower + 2)) % MOD;
            count = (count + helper(N, upper + 2, lower + 1)) % MOD; 
        } else if (lower - upper == 2) {
            count = (count + helper(N, upper + 2, lower)) % MOD;
        } else if (lower - upper == 1) {
            count = (count + helper(N, upper + 2, lower)) % MOD;
            count = (count + helper(N, upper + 2, lower + 1)) % MOD;
        } else if (upper - lower == 2) {
            count = (count + helper(N, upper, lower + 2)) % MOD;
        } else if (upper - lower == 1) {
            count = (count + helper(N, upper, lower + 2)) % MOD;
            count = (count + helper(N, upper + 1, lower + 2)) % MOD;
        }
    
        count = count % MOD;
        dp[upper][lower] = count;
        return count;    
    }
}