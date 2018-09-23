package edu.davidengel.advancedjava;


/**
 * This BasicStockService class his a concrete implementation of StockService
 *
 * @author David Engel
 * @verion 1.0
 * @since 9-15-2018
 */


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


    public StockQuote getQuote(String symbol) {

        return new StockQuote(new Date(), new BigDecimal(10.00), symbol );

    }

    /**
     * Creates stock quote using date and symbol
     * @param symbol
     * @param date
     * @return stockquote based on symbol and date
     */
    public StockQuote getQuote(String symbol, Date date) {

        return new StockQuote(date, new BigDecimal(10.00), symbol );

    }

    /**
     * Creates a list of stock quotes
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until the date of the last stock quote
     * @return new list of stock quotes using sample data
     */
    public List<StockQuote> getQuote(String symbol, Calendar from, Calendar until) {

        List<StockQuote> newQuoteList = new ArrayList<StockQuote>();

        newQuoteList.add(getQuote("csco", from.getTime()));
        newQuoteList.add(getQuote("csco", until.getTime()));

        return newQuoteList;
    }

}
