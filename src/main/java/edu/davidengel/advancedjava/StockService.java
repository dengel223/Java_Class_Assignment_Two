package edu.davidengel.advancedjava;

/**
 * This StockService interface is the contract for all stock services
 *
 * @author David Engel
 * @verion 1.0
 * @since 9-15-2018
 */


import java.util.Calendar;
import java.util.List;

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

    /**
     *
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until the date of the last stock quote
     * @return a list of SotckQuote instances.  ONe for each day in teh range specified.
     */
    List<StockQuote> getQuote(String symbol, Calendar from, Calendar until);

}
