package edu.davidengel.advancedjava;

/**
 * This is the main app to start the program
 *
 * @author David Engel and others
 * @verion 1.0
 * @since 9-15-2018
 */

public class App 
{


    /**
     * Creates the stock quote usign the stockservice factory
     * @param symbol string stock symbol
     * @return stockquote object
     */
    public StockQuote createQuote(String symbol)
    {

        //use the factory to get a new stockservice implementation
        StockService stockService = StockServiceFactory.getStockService();

        return stockService.getQuote(symbol);

    }
}
