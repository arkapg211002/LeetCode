// https://leetcode.com/problems/latest-time-by-replacing-hidden-digits

class Solution {
    public String maximumTime(String time) {
        char[] arr = new char[5];
        
        char first = time.charAt(0);
        char second = time.charAt(1);
        
        char third = time.charAt(3);
        char fourth = time.charAt(4);
        
        arr[2] = time.charAt(2); // adding : in mid
        
        // resolving the hh
        if(first == '?' && second == '?') {
            arr[0] = '2';
            arr[1] = '3';
        } else if(first == '?' && second != '?') {
            arr[1] = time.charAt(1);
            if(Character.getNumericValue(second) >= 4)
                arr[0] = '1';
            else
                arr[0] = '2';
        } else if(first != '?' && second == '?') {
            arr[0] = time.charAt(0);
            if(Character.getNumericValue(first) <= 1) {
                arr[1] = '9';
            } else {
                arr[1] = '3';
            }
        } else {
            arr[0] = time.charAt(0);
            arr[1] = time.charAt(1);
        }
        
        // resolving the mm
        if(third == '?' && fourth != '?') {
            arr[3] = '5';
            arr[4] = time.charAt(4);
        } else if(third != '?' && fourth == '?') {
            arr[3] = time.charAt(3);
            arr[4] = '9';
        } else if(third == '?' && fourth == '?') {
            arr[3] = '5';
            arr[4] = '9';
        } else {
            arr[3] = time.charAt(3);
            arr[4] = time.charAt(4);
        }
        
        return new String(arr);
    }
}