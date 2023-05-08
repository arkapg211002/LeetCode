// https://leetcode.com/problems/binary-number-with-alternating-bits

class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        for(int i=1;i<s.length();i+=2)
        {
            if(s.charAt(i)=='0' && s.charAt(i-1)!='1')return false;
            else if(s.charAt(i)=='1' && s.charAt(i-1)!='0')return false;
            else continue;
        }
        if(s.length()%2!=0 && s.charAt(s.length()-1)!=s.charAt(s.length()-2))return true;
        else if(s.length()%2!=0 && s.charAt(s.length()-1)==s.charAt(s.length()-2))return false;
        else return true;
        
    }
}