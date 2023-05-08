// https://leetcode.com/problems/check-if-all-as-appears-before-all-bs

class Solution {
    public boolean checkString(String s) {
        String str[]=s.split("");
        Arrays.sort(str);
        return (String.join("",str).compareTo(s)==0)?true:false;
    }
}