package edu.davidengel.advancedjava;

/**
 * Hello world!
 *
 */
public class App 
{
    public StockQuote createQuote(String symbol)
    {

        //use the factory to get a new stockservice implementation
        StockService stockService = StockServiceFactory.getStockService();

        return stockService.getQuote(symbol);

    }
}
