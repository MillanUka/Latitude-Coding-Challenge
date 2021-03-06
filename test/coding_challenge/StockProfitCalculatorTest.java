/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding_challenge;

import coding_challenge.StockProfitCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Millan Uka
 */
public class StockProfitCalculatorTest {

    /**
     * Test of getMaxProfit method,for an empty array Should return 0 as no
     * trade can be made
     */
    @Test
    public void testGetMaxProfitEmpty() {
        System.out.println("getMaxProfit empty array");
        int[] stockPrices = {};
        int expResult = 0;
        int result = StockProfitCalculator.getMaxProfit(stockPrices);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxProfit method,for an array that points to null
     */
    @Test
    public void testGetMaxProfitNull() {
        System.out.println("getMaxProfit null array");
        int[] stockPrices = null;
        int expResult = 0;
        int result = StockProfitCalculator.getMaxProfit(stockPrices);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxProfit method,for a small sized array
     */
    @Test
    public void testGetMaxProfitSmall() {
        System.out.println("getMaxProfit small array");
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        int expResult = 6;
        int result = StockProfitCalculator.getMaxProfit(stockPrices);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxProfit method,for a large array The inputs were randomly
     * generated between 10-25. With a 9 added near the beginning, a 26 added
     * near the end to prove that it works.
     */
    @Test
    public void testGetMaxProfitLarge() {
        System.out.println("getMaxProfit large array");
        int[] stockPrices = {20, 12, 21, 10, 9, 10, 20, 13, 21, 21, 23, 16, 22, 23, 11, 16, 17, 16, 21, 24, 21, 18, 14, 18, 23, 11, 19, 16, 18, 17, 25, 22, 16, 14, 24, 14, 10, 12, 22, 12, 13, 17, 10, 10, 19, 13, 16, 10, 22, 20, 25, 23, 12, 16, 21, 14, 20, 17, 14, 21, 19, 13, 21, 16, 18, 16, 11, 13, 22, 13, 18, 25, 15, 15, 23, 21, 13, 23, 24, 16, 20, 13, 20, 25, 23, 15, 15, 15, 15, 15, 25, 13, 22, 23, 24, 26, 22, 15, 8, 11};
        int expResult = 17;
        int result = StockProfitCalculator.getMaxProfit(stockPrices);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxProfit method,for an array of 1440 integers. 1440 is the
     * number of minutes in a day. Although markets are usually only open for
     * less than 8 hours The inputs were randomly generated between 10-25. With
     * a 9 added near the beginning, a 26 added near the end to prove that is
     * works. This test shows that the algorithm works on large arrays. Since
     * the algorithm is meant to work on stock prices for a whole day this would
     * probably be the maximum array size that the algorithm would have to deal
     * with.
     */
    @Test
    public void testGetMaxProfitVeryLarge() {
        System.out.println("getMaxProfit very large array");
        int[] stockPrices = {18, 10, 22, 9, 15, 21, 15, 16, 23, 10, 22, 22, 12, 24, 22, 11, 19, 19, 16, 18, 10, 14, 11, 20, 21, 14, 19, 10, 24, 21, 12, 14, 14, 14, 23, 21, 20, 20, 17, 24, 25, 12, 14, 18, 25, 21, 24, 15, 15, 20, 14, 16, 13, 20, 14, 22, 21, 25, 16, 12, 13, 21, 24, 13, 16, 16, 15, 24, 15, 20, 14, 12, 18, 25, 13, 22, 18, 13, 18, 24, 18, 23, 19, 16, 15, 15, 24, 19, 11, 24, 17, 20, 16, 10, 14, 22, 22, 24, 10, 10, 15, 25, 23, 20, 10, 18, 22, 12, 15, 19, 20, 11, 25, 18, 20, 14, 14, 15, 18, 21, 24, 12, 10, 23, 16, 14, 19, 24, 19, 18, 12, 11, 11, 16, 14, 21, 11, 22, 21, 12, 17, 15, 14, 10, 13, 21, 14, 10, 15, 11, 23, 10, 14, 17, 16, 13, 12, 24, 21, 18, 18, 14, 14, 11, 14, 15, 24, 22, 11, 16, 25, 10, 10, 23, 21, 18, 23, 16, 13, 25, 24, 13, 10, 19, 25, 16, 22, 11, 23, 20, 20, 17, 13, 25, 15, 23, 18, 20, 24, 20, 25, 21, 24, 13, 10, 24, 22, 20, 21, 21, 17, 18, 19, 25, 10, 18, 24, 21, 15, 19, 25, 13, 12, 19, 19, 15, 13, 16, 23, 12, 24, 17, 19, 12, 18, 13, 22, 17, 13, 17, 21, 22, 14, 16, 16, 13, 15, 13, 25, 25, 20, 24, 16, 10, 13, 23, 17, 16, 15, 19, 22, 20, 16, 16, 17, 18, 11, 18, 13, 14, 12, 22, 14, 18, 19, 15, 24, 13, 13, 13, 17, 18, 19, 21, 21, 23, 13, 10, 11, 15, 19, 22, 11, 16, 18, 15, 12, 12, 12, 10, 13, 23, 14, 17, 12, 13, 14, 23, 19, 23, 11, 16, 22, 10, 24, 12, 11, 13, 14, 12, 19, 15, 13, 14, 19, 24, 10, 19, 13, 25, 17, 24, 23, 22, 24, 16, 25, 15, 18, 20, 15, 25, 13, 21, 20, 12, 20, 24, 14, 13, 12, 17, 16, 24, 11, 22, 25, 14, 12, 17, 15, 10, 19, 18, 22, 24, 20, 12, 24, 12, 10, 25, 19, 21, 20, 16, 10, 24, 18, 22, 13, 24, 17, 16, 23, 22, 15, 20, 12, 12, 17, 20, 21, 16, 13, 17, 16, 24, 13, 12, 22, 11, 18, 13, 19, 16, 14, 25, 12, 22, 18, 24, 19, 17, 15, 22, 24, 10, 18, 13, 15, 14, 25, 16, 12, 12, 15, 17, 18, 15, 12, 20, 16, 11, 20, 13, 25, 10, 24, 14, 15, 22, 16, 18, 22, 25, 17, 25, 19, 12, 20, 18, 22, 13, 25, 20, 24, 16, 20, 12, 24, 22, 15, 13, 25, 17, 11, 16, 10, 20, 22, 18, 18, 13, 22, 19, 16, 11, 11, 20, 21, 11, 24, 25, 11, 11, 11, 19, 14, 10, 24, 11, 14, 10, 15, 21, 12, 24, 16, 17, 21, 15, 14, 21, 25, 19, 15, 20, 23, 24, 11, 18, 13, 12, 20, 16, 17, 24, 12, 13, 22, 24, 24, 13, 20, 25, 21, 24, 11, 20, 25, 13, 21, 24, 11, 14, 21, 18, 13, 12, 11, 18, 12, 23, 24, 20, 23, 12, 11, 15, 10, 23, 20, 23, 15, 20, 11, 20, 14, 11, 23, 23, 25, 12, 25, 21, 10, 20, 25, 14, 10, 20, 18, 25, 21, 18, 11, 23, 25, 23, 10, 16, 20, 13, 18, 10, 25, 16, 22, 18, 18, 15, 19, 23, 15, 18, 21, 14, 11, 15, 22, 10, 12, 20, 11, 12, 11, 11, 24, 20, 11, 13, 14, 18, 19, 25, 20, 10, 19, 18, 24, 16, 23, 12, 10, 25, 11, 22, 16, 17, 19, 12, 19, 17, 17, 12, 21, 21, 18, 16, 25, 21, 15, 11, 24, 15, 19, 24, 11, 24, 24, 13, 17, 15, 20, 12, 17, 10, 10, 20, 22, 20, 16, 13, 23, 18, 21, 13, 13, 17, 25, 14, 20, 19, 25, 20, 13, 23, 21, 21, 10, 25, 11, 23, 17, 22, 25, 25, 11, 15, 14, 21, 13, 11, 23, 18, 17, 23, 15, 24, 16, 24, 12, 23, 18, 12, 13, 14, 10, 15, 11, 20, 11, 21, 20, 17, 19, 19, 20, 19, 22, 25, 13, 12, 24, 10, 16, 20, 14, 13, 23, 14, 22, 14, 23, 21, 19, 24, 25, 22, 18, 10, 16, 21, 19, 14, 13, 17, 13, 11, 22, 12, 22, 17, 18, 23, 13, 23, 14, 11, 14, 21, 22, 17, 15, 20, 16, 11, 25, 21, 10, 16, 15, 17, 24, 22, 10, 12, 24, 20, 11, 16, 19, 25, 14, 13, 21, 18, 14, 11, 19, 13, 15, 21, 12, 22, 23, 12, 14, 10, 23, 15, 10, 11, 24, 16, 16, 18, 13, 21, 10, 20, 18, 11, 17, 15, 14, 12, 21, 16, 17, 10, 10, 10, 11, 23, 19, 19, 13, 12, 14, 23, 25, 14, 10, 13, 17, 21, 10, 24, 25, 10, 19, 14, 22, 19, 12, 16, 14, 19, 19, 15, 11, 12, 19, 13, 16, 16, 18, 20, 12, 25, 14, 25, 15, 22, 12, 14, 18, 11, 23, 21, 14, 20, 25, 18, 12, 16, 25, 17, 11, 22, 23, 14, 21, 12, 11, 16, 20, 12, 19, 25, 23, 18, 18, 12, 15, 21, 18, 11, 10, 23, 22, 18, 13, 21, 17, 15, 12, 12, 22, 11, 14, 14, 23, 17, 10, 15, 17, 16, 16, 24, 14, 17, 16, 19, 23, 22, 13, 14, 24, 22, 15, 12, 21, 13, 24, 21, 18, 13, 21, 14, 16, 18, 21, 16, 24, 15, 12, 23, 23, 24, 10, 25, 13, 14, 16, 10, 13, 11, 17, 13, 13, 10, 24, 19, 13, 18, 25, 17, 14, 19, 18, 22, 15, 16, 22, 24, 15, 19, 13, 13, 16, 19, 22, 16, 21, 10, 24, 24, 20, 13, 13, 25, 11, 21, 25, 25, 17, 19, 20, 22, 18, 13, 18, 23, 22, 24, 10, 18, 16, 11, 16, 12, 13, 21, 13, 13, 17, 25, 13, 11, 20, 18, 14, 19, 16, 14, 23, 15, 19, 25, 21, 16, 22, 24, 22, 19, 18, 15, 21, 23, 15, 19, 16, 12, 15, 13, 17, 17, 18, 17, 24, 22, 17, 21, 15, 24, 11, 11, 10, 17, 22, 12, 20, 20, 17, 12, 15, 19, 17, 16, 16, 12, 16, 11, 19, 20, 12, 10, 24, 19, 14, 24, 18, 25, 10, 17, 22, 10, 25, 20, 23, 24, 16, 19, 22, 25, 13, 16, 15, 14, 22, 21, 11, 16, 18, 18, 22, 11, 14, 21, 18, 12, 19, 14, 12, 18, 11, 19, 23, 14, 16, 11, 21, 17, 14, 22, 23, 22, 25, 13, 11, 13, 11, 14, 18, 20, 16, 24, 12, 11, 20, 19, 16, 21, 21, 15, 10, 18, 24, 10, 13, 24, 20, 16, 18, 23, 18, 16, 21, 24, 16, 15, 13, 16, 25, 24, 16, 23, 10, 12, 17, 18, 18, 22, 17, 12, 20, 13, 14, 21, 23, 24, 25, 24, 20, 21, 21, 19, 24, 25, 16, 12, 18, 11, 13, 22, 25, 12, 22, 21, 13, 22, 10, 22, 16, 24, 18, 24, 17, 15, 10, 20, 15, 24, 16, 25, 19, 10, 20, 16, 25, 18, 15, 21, 13, 17, 13, 18, 10, 22, 20, 11, 25, 13, 13, 22, 11, 21, 20, 22, 21, 18, 23, 14, 20, 20, 19, 20, 23, 23, 25, 22, 13, 11, 22, 13, 21, 13, 20, 21, 23, 11, 18, 19, 14, 20, 13, 22, 14, 18, 18, 10, 13, 21, 12, 25, 25, 21, 17, 21, 21, 22, 11, 21, 19, 16, 17, 19, 21, 19, 15, 24, 12, 10, 17, 18, 24, 19, 12, 19, 15, 17, 12, 14, 13, 21, 14, 23, 23, 21, 13, 10, 10, 17, 22, 22, 12, 16, 19, 15, 11, 12, 20, 19, 17, 12, 21, 24, 10, 21, 25, 14, 19, 23, 22, 24, 14, 16, 17, 11, 22, 15, 15, 25, 10, 22, 13, 21, 16, 12, 14, 11, 18, 17, 12, 10, 14, 13, 17, 21, 22, 24, 21, 23, 10, 12, 13, 15, 23, 20, 14, 17, 19, 21, 16, 11, 25, 21, 11, 19, 22, 15, 23, 11, 19, 17, 11, 22, 19, 14, 24, 16, 14, 18, 21, 12, 11, 13, 25, 20, 25, 12, 16, 11, 19, 14, 16, 12, 11, 15, 12, 22, 22, 15, 23, 19, 13, 20, 23, 11, 23, 14, 20, 23, 11, 16, 15, 15, 19, 12, 23, 26, 25, 12, 16, 25, 24, 24};
        int expResult = 17;
        int result = StockProfitCalculator.getMaxProfit(stockPrices);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxProfit method,where the highest price is before the lowest
     * price this is to test if the algorithm makes the purchase before the sale
     */
    @Test
    public void testGetMaxProfitHighBeforeLow() {
        System.out.println("getMaxProfit High before low");
        int[] stockPrices = {12, 8, 1, 4, 1, 0};
        int expResult = 3;
        int result = StockProfitCalculator.getMaxProfit(stockPrices);
        assertEquals(expResult, result);
    }
}
