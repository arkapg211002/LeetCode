// https://leetcode.com/problems/reformat-phone-number

class Solution {
    public String reformatNumber(String number) {
        return number.replaceAll("\\D", "").replaceAll("...?(?=..)", "$0-");
    }
}