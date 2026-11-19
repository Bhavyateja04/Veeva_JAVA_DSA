// Problem 6: Best Time to Buy and Sell Stock
// Easy
// Arrays
// One-pass approach

// Problem statement
// You are given an integer array prices, where prices[i] represents the price of a stock on the i-th day.

// You want to maximize your profit by choosing one day to buy the stock and a different day in the future to sell it.

// Return the maximum profit you can achieve. If you cannot make any profit, return 0.
// Example 1
// Input:
// prices = [7, 1, 5, 3, 6, 4]

// Output:
// 5


// Explanation:
// - Buy the stock on day 2 at price 1.
// - Sell the stock on day 5 at price 6.
// - Profit = 6 - 1 = 5.
// Example 2
// Input:
// prices = [7, 6, 4, 3, 1]

// Output:
// 0


// Explanation: Prices keep decreasing, so no profitable transaction is possible.


public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Calculate profit if we sell today
            int profit = prices[i] - minPrice;

            // Update maximum profit
            maxProfit = Math.max(maxProfit, profit);

            // Update minimum buying price
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
