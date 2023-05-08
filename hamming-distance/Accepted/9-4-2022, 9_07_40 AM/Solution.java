// https://leetcode.com/problems/hamming-distance

class Solution {
    public int hammingDistance(int x, int y) {
        int n=x^y;
        int c=0;
        while(n>0)
        {
            c+=1;
            n&=(n-1);
        }
        return c;
    }
}