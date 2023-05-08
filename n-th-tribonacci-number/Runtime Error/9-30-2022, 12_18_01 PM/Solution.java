// https://leetcode.com/problems/n-th-tribonacci-number

class Solution {
    public int tribonacci(int n) {
        int t[]=new int[n+1];
        t[0]=0;t[1]=1;t[2]=1;
        if(n==0)return t[0];
        else if(n==1)return t[1];
        else if(n==2)return t[2];
        for(int i=3;i<n+1;i++)
            t[i]=t[i-1]+t[i-2]+t[i-3];
        return t[n];
    }
}