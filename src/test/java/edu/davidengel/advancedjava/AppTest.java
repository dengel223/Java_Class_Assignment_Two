package edu.davidengel.advancedjava;

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


    @org.junit.Test
    public void createQuoteTestSymbol() {

        String expectedSymboValue = "csco";

        App app = new App();

        String actualSymbolValue = app.createQuote("csco").getStockSymbol();

        assertEquals(expectedSymboValue, actualSymbolValue);

    }

    @org.junit.Test
    public void createQuoteTestNegative() {

        App app = new App();

        String actualSymbolValue = app.createQuote("csco").getStockSymbol();

        assertNotNull(actualSymbolValue);

    }
}
