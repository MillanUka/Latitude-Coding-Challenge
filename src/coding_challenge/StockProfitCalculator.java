/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding_challenge;

/**
 *
 * @author Millan Uka
 */
public class StockProfitCalculator {
    /**
     * This method return the maximum amount of profit possible. The algorithm used. simply
     * does a couple of checks, such as the size of the array and if the array object is null. 
     * It then goes through the array of integer and does three operations. First it checks if the
     * price is less than the current minimum price and update the price, accordingly. It
     * is important that we do this during the loop as we do not want to simply find the lowest
     * number and the highest and then subtract them, as the sale has to be made after the purchase.
     * It then calculates the profit by subtracting the current element by the lowest price. Then 
     * checks if the profit is larger than the current maximum profit and changes it accordingly. And
     * then moves onto the next element until it reach the end of the array. It then return the maximum profit.
     * If there is a guaranteed loss based on the integers, the algorithm will return 0
     * @param stockPrices an array of integers representing stock prices in a linear time sequence. 
     * @return an integer value representing the maximum amount of profit that can be made based on the stock prices
     */
    public static int getMaxProfit(int[] stockPrices) {
        // Check if the array is null. Return 0 as a trade cannot be made
        if (stockPrices == null) 
            return 0;
        // Cannot make a trade if there is only 1 or less elements in the array. So return 0 if there is not enough elements.
        if (stockPrices.length < 2) 
            return 0;

        // Intialise the lowest price as an extremely large number.
        int lowestPrice = Integer.MAX_VALUE;
        // Intialise the max profit as 0 as that is lowest profit that can be made
        int maxProfit = 0;

        // Iterate through the entire array 
        for (int i = 0; i < stockPrices.length; i++) {
            // Get the current element
            int stockPrice = stockPrices[i];
            
            // Check if the current element is less than the lowest price. If it is, make it the new lowest price
            lowestPrice = (stockPrice < lowestPrice) ? stockPrice : lowestPrice;
            int profit = stockPrice - lowestPrice; // Calculate the profit
            //Check if the profit is bigger than the current maximum profit, change it if it is
            maxProfit = (profit > maxProfit) ? profit : maxProfit;

        }
        return maxProfit;
    }
}
