// https://leetcode.com/problems/base-7

class Solution {
    public String convertToBase7(int num) {
        String s="";
        while(num!=0)
        {
            int r=num%7;
            s=Integer.toString(r)+s;
            num/=7;            
        }
        return s;
    }
}