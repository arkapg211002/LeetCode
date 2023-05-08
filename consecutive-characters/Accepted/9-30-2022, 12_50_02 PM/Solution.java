// https://leetcode.com/problems/consecutive-characters

class Solution {
    public int maxPower(String s) {
        int maxLen = 1, length = 1;
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                length++;
                maxLen = Math.max(length, maxLen);
            }
            else{
                length = 1;
            }
        }
        return maxLen;
    }
}