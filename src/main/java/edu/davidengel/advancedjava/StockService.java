package edu.davidengel.advancedjava;

/**
 * This StockService interface is the contract for all stock services
 *
 * @author David Engel
 * @verion 1.0
 * @since 9-15-2018
 */




/**
 * Return the current price for a share of stock for the given symbol
 * @param symbol the stock symbol
 * @return a StockQuote instance
 */
public interface StockService {

    /**
     * Contract for getQuote to initialize the stock quote
     * @param symbol string of stock symbol
     * @return StockQuote already formatted
     */
    StockQuote getQuote(String symbol);

}
