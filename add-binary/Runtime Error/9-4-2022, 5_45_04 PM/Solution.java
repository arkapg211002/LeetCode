// https://leetcode.com/problems/add-binary

class Solution {
    public String addBinary(String a, String b) {
        int n=Integer.parseInt(a,2);
        int m=Integer.parseInt(b,2);
        int s=n+m;
        return Integer.toBinaryString(s);
    }
}