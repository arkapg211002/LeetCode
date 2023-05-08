// https://leetcode.com/problems/a-number-after-a-double-reversal

class Solution {
    public boolean isSameAfterReversals(int num) {
        int m=num;
        StringBuilder sb=new StringBuilder(Integer.toString(num));
        sb=sb.reverse();
        String s=sb.toString();
        s=s.replaceAll("0","");
        StringBuilder sb1=new StringBuilder(s);
        sb1=sb1.reverse();
        if(Integer.toString(m).equals(sb1.toString())==true)return true;
        else return false;
    }
}