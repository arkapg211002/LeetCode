// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;

        if (prices.length < 2) {
            return result;
        }

        int buy = prices[0];

        int buy_ = prices[0];
        int sell_ = 0;

        for (int i = 1; i < prices.length; i++) {
            int prevPrice = prices[i - 1];
            int price = prices[i];
            if (price > prevPrice) {
                sell_ = price;
            } else if (price < prevPrice && price < buy_) {
                buy_ = price;
                sell_ = 0;
                continue;
            }

            int overallProfit = sell_ - buy;
            if (overallProfit > result) {
                result = overallProfit;
            }

            int localProfit = sell_ - buy_;
            if (localProfit > result) {
                buy = buy_;
                result = localProfit;
            }
        }

        return result;
    }
}