// https://leetcode.com/problems/student-attendance-record-i

class Solution {
    public boolean checkRecord(String s) {
        int n = s.length();
        int absent = 0;
        int late = 0;
        for(int i = 0; i < n; i++) {
          if(s.charAt(i) == 'A') {
            absent++;
          }
          
          if(s.charAt(i) == 'L') {
            late++;
            if(late >= 3) {
              return false;
            }
          }
          
          else {
            late = 0;
          }
          
        }
        return (absent < 2);
    }
}