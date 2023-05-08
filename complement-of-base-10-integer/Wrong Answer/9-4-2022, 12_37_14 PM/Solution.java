// https://leetcode.com/problems/complement-of-base-10-integer

class Solution {
    public int bitwiseComplement(int n) {
        long i=1;
        while(i<=n)
        {
            n^=i;
            i<<=1;
        }
        return n;
    }
}