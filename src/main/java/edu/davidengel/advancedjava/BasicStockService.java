package edu.davidengel.advancedjava;

import java.math.BigDecimal;
import java.util.Date;

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

}
