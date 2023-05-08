// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero

class Solution {
    public int[] sumZero(int n) {
        int a[]=new int[n];
        if(n%2!=0)
        {
            a[n-1]=0;
            n=n-1;
        }
        int k=1;
        for(int i=0;i<n;i+=2)
        {
            a[i]=k;
            a[i+1]=k*(-1);
            k+=1;
        }
        return a;
        
    }
}