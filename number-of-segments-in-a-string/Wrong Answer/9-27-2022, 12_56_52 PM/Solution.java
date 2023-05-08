// https://leetcode.com/problems/number-of-segments-in-a-string

class Solution {
    public int countSegments(String s) {
        String st[]=s.split(" ");
        return st.length;
    }
}