// https://leetcode.com/problems/happy-number

class Solution {
    public boolean isHappy(int n) {
        while(n>3)
        {
            int d=n,p=0;
            while(d>0)
            {
                p+=(d%10)*(d%10);
                d/=10;
            }
            n=p;
        }
        if(n==1)return true;
        else return false;
    }
}