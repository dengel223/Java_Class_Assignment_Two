package edu.davidengel.advancedjava;

/**
 * This StockService interface is the contract for all stock services
 *
 * @author David Engel
 * @verion 1.0
 * @since 9-15-2018
 */


import com.sun.istack.internal.NotNull;

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
    StockQuote getQuote(@NotNull String symbol);

    /**
     * Get a historical list of stock quotes for the provided symbol.
     * This method will return one Stock Quote per 24 hour period.
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until the date of the last stock quote
     * @return a list of SotckQuote instances.  ONe for each day in teh range specified.
     */
    List<StockQuote> getQuote(@NotNull String symbol, @NotNull Calendar from, @NotNull Calendar until);

    /**
     *  Get a historical list of stock quotes for the provided symbol.
     *  This method will return one Stock Quote per internal specified.
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until the date of the last stock quote
     * @param interval the number of StockQuotes to get. E.g. if Interval.DAILY was specified
     *                 one StockQuote per day will be returned.
     * @return a list of StockQuote instances.  One for each day in the range specified.
     */
    List<StockQuote> getQuote(@NotNull String symbol, @NotNull Calendar from, @NotNull Calendar until,
                              @NotNull IntervalEnum interval);
}
