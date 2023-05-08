// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int id=2,c=0;
        for(int i=cost.length-1;i>=0;i--)
        {
            if(i==cost.length-1-id)
            {
                id+=2;
                continue;
            }
            c+=cost[i];
        }
        return c;
    }
}