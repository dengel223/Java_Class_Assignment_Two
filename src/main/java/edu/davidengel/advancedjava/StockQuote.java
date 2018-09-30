package edu.davidengel.advancedjava;

/**
 * This StockQuote class holds container data for stock quote
 *
 * @author David Engel and others
 * @verion 1.0
 * @since 9-15-2018
 */



import org.jetbrains.annotations.NotNull;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * Container for stock quote data
 */
@Immutable
public class StockQuote {

    private String stockSymbol; //stock symbol
    private BigDecimal stockPrice; //big decimal price for stock
    private Date dateRecorded; //date request made

    /**
     * Container for stock quote data
     * @param dateRecorded date for now
     * @param stockPrice price of stock
     * @param stockSymbol stock symbol
     */
    public StockQuote(@NotNull Date dateRecorded, @NotNull BigDecimal stockPrice, @NotNull String stockSymbol) {
        this.dateRecorded = dateRecorded;
        this.stockPrice = stockPrice;
        this.stockSymbol = stockSymbol;
    }

    /**
     * get for stock symbol
     * @return string symbol
     */
    public String getStockSymbol() { return stockSymbol;}

    /**
     * get for stock price
     * @return stock price
     */
    public BigDecimal getStockPrice() { return stockPrice;}

    /**
     * get for date of request
     * @return date
     */
    public Date getDateRecorded() { return dateRecorded; }

}
