// https://leetcode.com/problems/remove-letter-to-equalize-frequency

class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];
        for(char c : word.toCharArray()) freq[c-'a']++;

        Arrays.sort(freq);
        int min = 0;
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                min = i;
                break;
            }
        }

        if(freq[25] == 1 || min == 25) return true;
        if(freq[min] == 1 && freq[min+1] == freq[25]) return true;
        if(freq[25] - freq[min] == 1 && freq[min] == freq[24]) return true;

        return false;
    }
}