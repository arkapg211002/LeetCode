// https://leetcode.com/problems/number-of-valid-clock-times

class Solution {
    public int countTime(String t) {
        int c=1;
        if(t.charAt(0)=='?'){
            if(t.charAt(1)>='4'&&t.charAt(1)<='9') c*=2;
            else c*=3;
        }
        if(t.charAt(1)=='?'){
            if(t.charAt(0)=='?') c=24;
            else if(t.charAt(0)=='2') c*=4;
            else c*=10;
        }
        if(t.charAt(3)=='?') c*=6;
        if(t.charAt(4)=='?') c*=10;
        return c;
    }
}