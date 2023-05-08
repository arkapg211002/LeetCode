// https://leetcode.com/problems/maximum-difference-by-remapping-a-digit

class Solution {
public int minMaxDifference(int num) {
    String s = Integer.toString(num);
    char temp = '9';
    for(char c : s.toCharArray()){
        if(c != '9'){
            temp = c;
            break;
        }
    }
    return Integer.parseInt(s.replace(temp, '9')) - Integer.parseInt(s.replace(s.charAt(0), '0'));
}
}