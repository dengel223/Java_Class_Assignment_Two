package edu.davidengel.advancedjava;


/**
 * This BasicStockService class his a concrete implementation of StockService
 *
 * @author David Engel
 * @verion 1.0
 * @since 9-15-2018
 */


import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BasicStockService implements StockService {

    /**
     * Concrete implementation of Stock Service, hard codes a new stock quote
     * until manager gives us a real data source
     * @param symbol the stock symbol
     * @return a new stockquote initialized
     */


    public StockQuote getQuote(@NotNull String symbol) {

        return new StockQuote(new Date(), new BigDecimal(10.00), symbol );

    }

    /**
     * Creates stock quote using date and symbol
     * @param symbol
     * @param date
     * @return stockquote based on symbol and date
     */
    public StockQuote getQuote(@NotNull String symbol, @NotNull Date date) {

        return new StockQuote(date, new BigDecimal(10.00), symbol );

    }

    /**
     * Creates a list of stock quotes, assumes a DAILY interval
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until the date of the last stock quote
     * @return new list of stock quotes using sample data
     */
    public List<StockQuote> getQuote(@NotNull String symbol, @NotNull Calendar from, @NotNull Calendar until) {

        List<StockQuote> newQuoteList = new ArrayList<StockQuote>();

        for (Calendar date = from; date.compareTo(until) <=0; date.add(Calendar.DATE, 1  ))
        {
            newQuoteList.add(getQuote("csco", date.getTime()));
        }

        return newQuoteList;
    }

    /**
     *
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until the date of the last stock quote
     * @param interval the number of StockQuotes to get. E.g. if Interval.DAILY was specified
     *                 one StockQuote per day will be returned.
     * @return
     */
    public List<StockQuote> getQuote(@NotNull String symbol, @NotNull Calendar from, @NotNull Calendar until,
                                     @NotNull IntervalEnum interval) {

        List<StockQuote> newQuoteList = new ArrayList<StockQuote>();

        switch (interval) {

            case HOURLY:
                //Returns one list entry per hour.
                for (Calendar date = from; date.compareTo(until) <= 0; date.add(Calendar.HOUR, 1  ))
                {
                    newQuoteList.add(getQuote("csco", date.getTime()));
                }
                break;

            case SEMIDAILY:
                //Returns one list entry per 12 hours.
                for (Calendar date = from; date.compareTo(until) <= 0; date.add(Calendar.HOUR, 12  ))
                {
                    newQuoteList.add(getQuote("csco", date.getTime()));
                }
                break;

            case DAILY:
                //Returns one list entry per day.
                newQuoteList = getQuote(symbol, from, until);
                break;
        }

        return newQuoteList;

    }

}
