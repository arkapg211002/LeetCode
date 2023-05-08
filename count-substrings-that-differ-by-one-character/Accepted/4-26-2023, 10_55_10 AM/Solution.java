// https://leetcode.com/problems/count-substrings-that-differ-by-one-character

class Solution {
    public int countSubstrings(String s, String t) {
        int n = s.length();
        int m = t.length(); 
        int [][] lcs = new int[n][m];
        int [][] diff = new int[n][m]; 
        int count = 0; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { 
                if (s.charAt(i) == t.charAt(j)) 
                {
                    diff[i][j] = (i == 0 || j == 0) ? 0 : diff[i - 1][j - 1]; 
                    lcs[i][j] = (i == 0 || j == 0) ? 1 : lcs[i - 1][j - 1] + 1; 
                } 
                else 
                {
                    diff[i][j] = (i == 0 || j == 0) ? 1 : lcs[i - 1][j - 1] + 1;
                    lcs[i][j] = 0; 
                }
                count += diff[i][j];
            }
        }
        return count;
    }
}