// https://leetcode.com/problems/maximum-score-words-formed-by-letters

class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq = new int[26];
        for (char c : letters) {
            freq[c - 'a']++;
        }
        return maxScoreWordsHelper(words, freq, score, 0);
    }
    
    private int maxScoreWordsHelper(String[] words, int[] freq, int[] score, int index) {
        if (index == words.length) {
            return 0;
        }
        int maxScore = 0;
        int[] newFreq = freq.clone();
        int curScore = 0;
        boolean isValid = true;
        for (char c : words[index].toCharArray()) {
            int i = c - 'a';
            if (newFreq[i] == 0) {
                isValid = false;
                break;
            }
            newFreq[i]--;
            curScore += score[i];
        }
        if (isValid) {
            curScore += maxScoreWordsHelper(words, newFreq, score, index + 1);
            maxScore = Math.max(maxScore, curScore);
        }
        maxScore = Math.max(maxScore, maxScoreWordsHelper(words, freq, score, index + 1));
        return maxScore;
    }
}