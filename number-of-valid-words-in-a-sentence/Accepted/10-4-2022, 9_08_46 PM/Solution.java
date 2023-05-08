// https://leetcode.com/problems/number-of-valid-words-in-a-sentence

class Solution {
    int hyphCount = 0, puncCount = 0;
    public int countValidWords(String sentence) {
        String[] arr = sentence.split(" +");
        int count = 0;
        for (String s: arr) {
            if (s.length()==0) continue;
            if (isValid(s)) count++;
            hyphCount = 0;
            puncCount = 0;
        }
        return count;
    }
    
    public boolean isValid(String s) {
        int n = s.length();
        for (int i=0; i<n; i++) {
            if (!((Character.isLowerCase(s.charAt(i)) && Character.isAlphabetic(s.charAt(i))) || validPunc(s, n, i) || validHyph(s, n, i))) 
                return false;
        }
        return true;
    }
    
    public boolean validPunc(String s, int n, int i) {
        if (s.charAt(i)=='.' || s.charAt(i)==',' || s.charAt(i)=='!' && puncCount==0) {
            puncCount++;
            if (i==n-1) return true;
        }
        return false;
    }
    public boolean validHyph(String s, int n, int i) {
        if (s.charAt(i)=='-' && hyphCount == 0) {
            hyphCount++;
            if (i==n-1 || i==0) return false;
            if (!Character.isAlphabetic((s.charAt(i-1))) || !Character.isAlphabetic(s.charAt(i+1)))
                return false;
            return true;
        }
        return false;
    }
    
}