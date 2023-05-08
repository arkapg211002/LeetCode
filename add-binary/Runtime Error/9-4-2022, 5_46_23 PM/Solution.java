// https://leetcode.com/problems/add-binary

class Solution {
    public String addBinary(String a, String b) {
        long n=Long.parseLong(a,2);
        long m=Long.parseLong(b,2);
        long s=n+m;
        return Long.toBinaryString(s);
    }
}