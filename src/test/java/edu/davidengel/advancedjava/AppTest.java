package edu.davidengel.advancedjava;

/**
 * This is a test class for stockquotes and stockservices
 *
 * @author David Engel and others
 * @verion 1.0
 * @since 9-15-2018
 */


//import junit.framework.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    //extends TestCase
{


    /**
     * Positive Test Single Quote
     */
    @Test
    public void createQuoteTestSymbol() {

        String expectedSymboValue = "csco";

        App app = new App();

        String actualSymbolValue = app.createQuote("csco").getStockSymbol();

        assertEquals("Symbol fed to factory should match return symbol",expectedSymboValue, actualSymbolValue);

    }

    /**
     * Negative Test Single Quote
     */
    @Test
    public void createQuoteTestNegative() {

        App app = new App();

        String actualSymbolValue = app.createQuote("csco").getStockSymbol();

        assertNotNull("Stock Symbol should be null",actualSymbolValue);

    }


    /**
     * Positive Test List of Quotes - Symbol Only
     */
    @Test
    public void createQuotesTestSymbol() throws ParseException {

        String expectedSymbolValue = "csco";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date from = sdf.parse("9/22/2018");
        Date end = sdf.parse("9/23/2018");

        List<StockQuote> stockQuotes = StockQuoteApplication.createQuotes("csco", from, end);

        String actualSymbolValue;

        for (StockQuote quote : stockQuotes )
        {
            actualSymbolValue = quote.getStockSymbol();

            assertEquals("Symbol fed to factory should match return symbol",expectedSymbolValue, actualSymbolValue);

        }
    }

    /**
     * Positive Test List of Quotes - Date Only
     */
    @Test
    public void createQuotesTestDate() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date from = sdf.parse("9/22/2018");
        Date end = sdf.parse("9/23/2018");

        List<StockQuote> stockQuotes = StockQuoteApplication.createQuotes("csco", from, end);

        for (StockQuote quote : stockQuotes )
        {

            assertTrue("Stock quote day should be in range", (quote.getDateRecorded().compareTo(from) >= 0
                    && quote.getDateRecorded().compareTo(end) <= 0) );

        }
    }

    /**
     * Negative Test List of Quotes
     */
    @Test
    public void createQuotesTestSymbolNegative() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date from = sdf.parse("9/22/2018");
        Date end = sdf.parse("9/23/2018");

        List<StockQuote> stockQuotes = StockQuoteApplication.createQuotes("csco", from, end);

        //String actualSymbolValue = app.createQuote("csco").getStockSymbol();
        String actualSymbolValue;

        for (StockQuote quote : stockQuotes )
        {
            actualSymbolValue = quote.getStockSymbol();

            assertNotNull("Stock Symbol should be null",actualSymbolValue);

        }
    }

    /**
     * Negative Test List of Quotes
     */
    @Test
    public void createQuotesTestDateNegative() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date from = sdf.parse("9/22/2018");
        Date end = sdf.parse("9/23/2018");

        List<StockQuote> stockQuotes = StockQuoteApplication.createQuotes("csco", from, end);

        for (StockQuote quote : stockQuotes )
        {

            assertFalse("Stock quote day should be in range", ! (quote.getDateRecorded().compareTo(from) >= 0
                    && quote.getDateRecorded().compareTo(end) <= 0) );

        }
    }

    /**
     * Negative test of main
     * @throws ParseException
    */
    @Test(expected = NullPointerException.class)
    public void testMainNegative() throws ParseException {

        StockQuoteApplication.main(null);

    }

    /**
     * Positive test of main
     * @throws ParseException
     */
    @Test
    public void testMainPositive() throws ParseException {

        StockQuoteApplication.main(new String[] {"csco", "9/23/2018", "9/24/2018"});

        assertTrue(true);
    }


}
