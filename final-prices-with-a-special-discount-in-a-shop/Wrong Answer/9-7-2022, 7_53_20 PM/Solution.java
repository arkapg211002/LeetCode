// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop

class Solution {
    public int[] finalPrices(int[] prices) {
        int a[]=new int[prices.length];
        for(int i=0;i<prices.length;i++)
        {
            if(i+1==prices.length)a[i]=prices[i];
            else if(prices[i+1]>prices[i])a[i]=prices[i];
            for(int j=i+1;j<prices.length-1;j++)
            {
                if(prices[j]<=prices[i] && prices[j]<prices[j+1])
                {
                    a[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return a;
    }
}