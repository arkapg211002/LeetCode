// https://leetcode.com/problems/a-number-after-a-double-reversal

class Solution {
    public boolean isSameAfterReversals(int num) {
        int m=num;
        StringBuilder sb=new StringBuilder(Integer.toString(num));
        int n=sb.length();
        if(n==1)return true;
        sb=sb.reverse();
        
        StringBuilder s=new StringBuilder();
        s=sb;
        while(s.charAt(0)=='0')
        {
            s=s.delete(0,1);
        }
        
        
        
        
        StringBuilder sb1=new StringBuilder();
        sb1=s;
        sb1=sb1.reverse();
        
        
        
        if(Integer.toString(m).equals(sb1.toString())==true)return true;
        else return false;
    }
}