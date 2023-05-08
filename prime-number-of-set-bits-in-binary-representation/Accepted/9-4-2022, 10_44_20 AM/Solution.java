// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++)
        {
            if(prime(count(i))==1)c+=1;
        }
        return c;
    }
    public int count(int n)
    {
        int c=0;
        while(n>0)
        {
            n&=(n-1);
            c+=1;
        }
        return c;
    }
    public int prime(int n)
    {
        if(n==1)return 0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)return 0;
        }
        return 1;
    }
}