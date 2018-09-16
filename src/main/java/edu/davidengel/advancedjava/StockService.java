package edu.davidengel.advancedjava;

public interface StockService {

    /**
     * Return the current price for a share of stock for the given symbol
     * @param symbol the stock symbol
     * @return a StockQuote instance
     */
    StockQuote getQuote(String symbol);

}
