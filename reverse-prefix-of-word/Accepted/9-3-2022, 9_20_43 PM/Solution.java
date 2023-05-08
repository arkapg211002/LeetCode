// https://leetcode.com/problems/reverse-prefix-of-word

class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)==-1)return word;
        int id=word.indexOf(ch);
        String s=word.substring(0,id+1);
        StringBuilder sb=new StringBuilder(s);
        s=sb.reverse().toString()+word.substring(id+1);
        return s;
    }
}