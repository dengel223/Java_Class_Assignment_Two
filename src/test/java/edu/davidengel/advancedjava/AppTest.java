package edu.davidengel.advancedjava;

/**
 * This is a test class for stockquotes and stockservices
 *
 * @author David Engel and others
 * @verion 1.0
 * @since 9-15-2018
 */


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    //extends TestCase
{


    /**
     * Positive Test
     */
    @org.junit.Test
    public void createQuoteTestSymbol() {

        String expectedSymboValue = "csco";

        App app = new App();

        String actualSymbolValue = app.createQuote("csco").getStockSymbol();

        assertEquals("Symbol fed to factory should match return symbol",expectedSymboValue, actualSymbolValue);

    }

    /**
     * Negative Test
     */
    @org.junit.Test
    public void createQuoteTestNegative() {

        App app = new App();

        String actualSymbolValue = app.createQuote("csco").getStockSymbol();

        assertNotNull("Stock Symbol should be null",actualSymbolValue);

    }
}
