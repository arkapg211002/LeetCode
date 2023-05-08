// https://leetcode.com/problems/palindrome-partitioning-ii

class Solution {
    
    int[][] dp;
    
    public int minCut(String s) 
    {
        dp = new int[s.length()][s.length()];
        
        for(int i[]: dp)
            Arrays.fill(i , -1);

        return solve(s , 0 , s.length()-1);
    }
    
    private int solve(String s , int i , int j)
    {
        int left,right;
        if(i>=j)
            return 0;
        
        if(is_palindrome(s , i , j) == true)
            return 0;
        
        if(dp[i][j] != -1)
            return dp[i][j];
        
        dp[i][j] = Integer.MAX_VALUE;
        
        for(int k=i; k<j ; k++)
        {
            if(is_palindrome(s , i , k ) == true)
            {
                int count = Math.min(dp[i][j] , solve(s , i , k) + solve(s, k+1 , j) +1);
                
                dp[i][j] = count;
            }
        }
        return dp[i][j];
        
        
    }
    
    private boolean is_palindrome(String s , int low , int high)
    {
        while(low < high)
        {
            if(s.charAt(low++) != s.charAt(high--))
                return false;
        }
        return true;
    }
}