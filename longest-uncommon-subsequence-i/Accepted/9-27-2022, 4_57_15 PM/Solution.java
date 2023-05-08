// https://leetcode.com/problems/longest-uncommon-subsequence-i

class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
        return -1;
    }
      return   b.length()>a.length() ? b.length() : a.length();
	  /*
	    I used here conditional opeartor or, ternary operator 
	  */
    
    }
}