// https://leetcode.com/problems/reverse-integer

class Solution {
    public int reverse(int x) {
        int c=0;
        if(x<0)
        {
            x*=(-1);
            c=1;
        }
        String s=Integer.toString(x);
        StringBuilder sb=new StringBuilder(s).reverse();
        s=sb.toString();
        int d=Integer.parseInt(s);
        if(c==1)d*=(-1);
        if(d< (int)Math.pow(2,31)*(-1) || d> (int)Math.pow(2,31)-1)return 0;
        return d;
    }
}