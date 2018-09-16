package edu.davidengel.advancedjava;

import java.math.BigDecimal;
import java.util.Date;

public class StockQuote {


    /**
     * Container class for stock quotes.
     */
    private String stockSymbol;
    private BigDecimal stockPrice;
    private Date dateRecorded;

    public StockQuote(Date dateRecorded, BigDecimal stockPrice, String stockSymbol) {
        this.dateRecorded = dateRecorded;
        this.stockPrice = stockPrice;
        this.stockSymbol = stockSymbol;
    }

    public String getStockSymbol() { return stockSymbol;}
    public BigDecimal getStockPrice() { return stockPrice;}
    public Date getDateRecorded() { return dateRecorded; }

}
