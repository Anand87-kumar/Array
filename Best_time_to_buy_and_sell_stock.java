package com.anand;

public class Best_time_to_buy_and_sell_stock {

	public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example stock prices

        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price if a lower price is encountered
            } else {
                int currentProfit = prices[i] - minPrice; // Calculate potential profit
                maxProfit = Math.max(maxProfit, currentProfit); // Update maximum profit if currentProfit is greater
            }
        }

        return maxProfit;
    }
}