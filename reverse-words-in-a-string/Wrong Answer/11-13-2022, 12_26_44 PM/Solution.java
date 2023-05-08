// https://leetcode.com/problems/reverse-words-in-a-string

class Solution {
    public String reverseWords(String s) {
        String st[]=s.split(" ");
        String re="";
        for(int i=st.length-1;i>=0;i--)
        {
            re+=st[i]+" ";
        }
        return re.trim();
    }
}