// https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range

class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        int count = 0;

        for (int i = left; i <= right ; i++) {

            String s = words[i];

            if (Vowel (s.charAt(0)) && Vowel (s.charAt(s.length()-1))) {

                count += 1;
            }
        }

        return count;
        
    }

    public boolean Vowel (char ch) {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

            return true;
        }

        return false;
    }
}