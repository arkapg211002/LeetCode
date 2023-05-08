// https://leetcode.com/problems/frog-jump-ii

class Solution {
    public int maxJump(int[] stones) {
        int max=stones[1]-stones[0];
        for(int i=2;i<stones.length;i++)
            max=(int)Math.max(max,stones[i]-stones[i-2]);
        return max;
    }
}