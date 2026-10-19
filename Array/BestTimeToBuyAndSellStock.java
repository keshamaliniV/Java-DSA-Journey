
/*
Problem: Best Time to Buy and Sell Stock

Input:
prices = [7, 1, 5, 3, 6, 4]

Output:
5

Explanation:
Buy the stock at price 1.
Sell the stock at price 6.
Maximum profit = 6 - 1 = 5.

Approach:
1. Initialize min with the first day's price.
2. Initialize max profit as 0.
3. Traverse the array from the second day.
4. Update min with the lowest price seen so far.
5. Calculate the profit using the current price and min.
6. Update max with the highest profit.
7. Return max.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
           min=Math.min(min,prices[i]);
           max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}
