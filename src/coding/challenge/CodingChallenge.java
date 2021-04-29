/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.challenge;

/**
 *
 * @author ukami
 */
public class CodingChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        System.out.println(getMaxProfit(stockPrices));
    }

    public static int getMaxProfit(int[] stockPrices) {
        // Cannot make a trade if there is only 1 element in the array
        if(stockPrices.length < 2) {
            return 0;
        }
        int maxProfit =  stockPrices[1] - stockPrices[0];
        for(int i =0; i < stockPrices.length; i++) {
            int stockPrice = stockPrices[i];
            for(int j =1+i; j < stockPrices.length; j++) {
                int profit =  stockPrices[j] - stockPrice;
                if(profit > maxProfit) {
                    //System.out.println("Bought at $" + stockPrice + " sold at $" + stockPrices[j] );
                    maxProfit = profit; 
                }
            }
        }
        return maxProfit;
    }
}
