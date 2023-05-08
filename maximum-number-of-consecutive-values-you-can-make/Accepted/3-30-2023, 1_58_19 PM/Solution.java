// https://leetcode.com/problems/maximum-number-of-consecutive-values-you-can-make

class Solution {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int c=0;
        for(int i=0;i<coins.length;i++)
        {
            if(coins[i]>c+1)break;
            else c+=coins[i];
        }
        return c+1;
    }
}