// https://leetcode.com/problems/maximum-ice-cream-bars

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        //Sorting in Ascending order
        Arrays.sort(costs);
        int maxCost = 0;
        for(int i=0; i<costs.length; i++){
            //returning when we've exhausted all coins
            if(maxCost + costs[i] > coins) return i;
            maxCost += costs[i];
        }
        return costs.length;
    }
}