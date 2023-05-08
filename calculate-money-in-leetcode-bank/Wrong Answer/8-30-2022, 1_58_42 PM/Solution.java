// https://leetcode.com/problems/calculate-money-in-leetcode-bank

class Solution {
    public int totalMoney(int n) {
        int c=0,m=1,k=0,s=1;
        for(int i=1;i<=n;i++)
        {
            if(k==7)
            {
                m+=1;s=m;k=1;
            }
            c+=s;k+=1;s+=1;
        }
        return c;
    }
}