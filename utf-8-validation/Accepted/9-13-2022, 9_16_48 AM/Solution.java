// https://leetcode.com/problems/utf-8-validation

class Solution {
    public boolean validUtf8(int[] data) {
        int[] pattern = new int[] {0x00, 0xc0, 0xe0, 0xf0};
        int[] maskFirst = new int[] {0x80, 0xe0, 0xf0, 0xf8};
        int maskFollow = 0xc0;
        int i = 0;
        while (i < data.length) {
            int match = -1;
            for (int j = 3; j >= 0; j--) {
                if ((data[i] & maskFirst[j]) == pattern[j]) {
                    match = j;
                    break;
                }
            }
            if (match == -1) return false;
            for (int j = i+1; j <= i+match; j++) {
                if (j >= data.length || (data[j] & maskFollow) != 0x80) {
                    return false;
                }
            }
            i += (match + 1);
        }
        return true;
    }
}