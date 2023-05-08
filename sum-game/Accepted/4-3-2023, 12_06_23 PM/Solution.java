// https://leetcode.com/problems/sum-game

class Solution {
    public boolean sumGame(String num) {
        int leftSum = 0;
        int rightSum = 0;
        int leftMove = 0;
        int rightMove = 0;
        for(int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) == '?') {
                leftMove++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }
        
        for(int i = num.length() / 2; i < num.length(); i++) {
            if (num.charAt(i) == '?') {
                rightMove++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }

        if ((leftMove + rightMove) % 2 == 1) {
            return true;
        }
        
        int aliceMove = (leftMove + rightMove) / 2;

        int leftLower = leftSum;
        int leftUpper = leftSum + leftMove * 9;

        int rightLower = rightSum;
        int rightUpper = rightSum + rightMove * 9;

        if (leftLower > rightUpper || rightLower > leftUpper) {
            return true;
        }

        // aliceTarget is the # of possibilities that Alice needs to 
        // eliminate by replacing ? with numbers to make sure 
        // possible range of each half has no overlapping before Bob's
        // last move
        int aliceTarget = Math.min(leftUpper - rightLower, rightUpper - leftLower) + 1;

        return aliceMove * 9 >= aliceTarget;
    }
}