// https://leetcode.com/problems/bag-of-tokens

class Solution {
   public int bagOfTokensScore(int[] tokens, int power) {
       // Edge cases
        if (tokens.length == 0) return 0;
        if (tokens.length == 1) {
            if (power >= tokens[0]) {
                return 1;
            }else return 0;
        }
        int score = 0;
        Arrays.sort(tokens); // Sorting the array will help a lot
        int left = 0, right = tokens.length-1;

        while (left <= right) {
            if (tokens[left] <= power) { // If true play face-up
                power -= tokens[left];
                score++;
                left++;
            }else if (score >= 1 && tokens[right] >= power) {
                if (left == right) {
                    return score; // Now we can't play anymore
                }
                power += tokens[right]; // If we can play face-down
                score--;
                right--;
            }else return score; // If no upper conditions are true that means we don't have sufficient power or score to play
        }
        return score;
    }
}