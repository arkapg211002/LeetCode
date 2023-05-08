// https://leetcode.com/problems/binary-watch

class Solution {
    public List < String > readBinaryWatch(int turnedOn) {
        List < String > result = new ArrayList();
        StringBuilder str;
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    str= new StringBuilder(5);
                    str.append(h).append(':').append(m <= 9 ? "0" :"").append(m);
                    result.add(str.toString());
                }
            }
        }
        return result;
    }
}