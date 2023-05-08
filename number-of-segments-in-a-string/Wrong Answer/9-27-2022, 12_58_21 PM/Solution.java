// https://leetcode.com/problems/number-of-segments-in-a-string

class Solution {
    public int countSegments(String s) {
        if(s.length()==0)return 0;
        String st[]=s.split(" ");
        return st.length;
    }
}