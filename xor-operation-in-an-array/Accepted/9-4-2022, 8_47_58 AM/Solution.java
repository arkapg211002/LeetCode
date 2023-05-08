// https://leetcode.com/problems/xor-operation-in-an-array

class Solution {
    public int xorOperation(int n, int start) {
        //int a[]=new int[n],
        int c=0;
        for(int i=0;i<n;i++)
        {
            //a[i]=start+2*i;
            c=c^(start+2*i);
        }
        return c;
    }
}