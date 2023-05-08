// https://leetcode.com/problems/binary-number-with-alternating-bits

class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)=='0' && s.charAt(i-1)!='1')return false;
            else if(s.charAt(i)=='1' && s.charAt(i-1)!='0')return false;
            else continue;
        }
        return true;
        
    }
}