// https://leetcode.com/problems/replace-all-digits-with-characters

class Solution {
    public String replaceDigits(String s) {
        String str[]=s.split("");
        for(int i=1;i<str.length;i+=2)
        {
            str[i]=Character.toString((char)((int)str[i-1].charAt(0)+Integer.valueOf(str[i])));
        }
        return String.join("",str);
    }
}