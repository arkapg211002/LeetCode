// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop

class Solution {
    public int[] finalPrices(int[] prices) {
        //int a[]=new int[prices.length];
        for(int i=0;i<prices.length;i++)
        {
            if(i+1==prices.length)break;
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]<=prices[i])
                {
                    prices[i]-=prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}