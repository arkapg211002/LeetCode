// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int id=cost.length-3,c=0;
        for(int i=cost.length-1;i>=0;i--)
        {
            if(i==id)
            {
                id-=3;
                continue;
            }
            c+=cost[i];
        }
        return c;
    }
}