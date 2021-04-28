/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.challenge;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ukami
 */
public class CodingChallengeTest {
    
    public CodingChallengeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CodingChallenge.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CodingChallenge.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxProfit method,for a small sized array
     */
    @Test
    public void testGetMaxProfitSmall() {
        System.out.println("getMaxProfit small array");
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        int expResult = 6;
        int result = CodingChallenge.getMaxProfit(stockPrices);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getMaxProfit method,for an empty array
     */
    @Test
    public void testGetMaxProfitEmpty() {
        System.out.println("getMaxProfit empty array");
        int[] stockPrices = {};
        int expResult = 0;
        int result = CodingChallenge.getMaxProfit(stockPrices);
        assertEquals(expResult, result);
    }++
    
        
    /**
     * Test of getMaxProfit method,for an empty array
     */
    @Test
    public void testGetMaxProfitLarge() {
        System.out.println("getMaxProfit large array");
        int[] stockPrices = {14, 5, 12, 15, 15, 6, 12, 14, 13, 8, 11, 5, 10, 7, 8, 8, 9, 10, 14, 9, 8, 12, 10, 12, 13, 14, 14, 7, 13, 12, 10, 8, 9, 7, 11, 7, 7, 8, 9, 7, 15, 7, 10, 7, 8, 10, 6, 11, 7, 8, 15, 8, 11, 5, 9, 6, 10, 11, 14, 8, 6, 14, 6, 12, 9, 8, 13, 5, 14, 5, 5, 5, 11, 8, 10, 14, 13, 15, 13, 13, 13, 8, 12, 9, 6, 15, 14, 14, 10, 9, 10, 5, 13, 11, 10, 11, 7, 13, 11, 12};
        int expResult = 0;
        int result = CodingChallenge.getMaxProfit(stockPrices);
        assertEquals(expResult, result);
    }
    
}
