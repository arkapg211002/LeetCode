// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position

class Solution {
    public int minCostToMoveChips(int[] position) {
        int c = 0;
        for(int i=0;i<position.length;i++)
            if(position[i]%2==0)
                c+=1;
        return Math.min(c,position.length-c);
    }
}