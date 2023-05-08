// https://leetcode.com/problems/complement-of-base-10-integer

class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        long i=1;
        while(i<=n)
        {
            n^=i;
            i<<=1;
        }
        return n;
    }
}