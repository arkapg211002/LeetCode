// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        StringBuffer sb=new StringBuffer(Integer.toString(x));
        return (sb.toString().compareTo(sb.reverse().toString())==0)?true:false;
        /*if(sb.toString().compareTo(sb.reverse().toString())==0)return true;
        else return false;*/
    }
}