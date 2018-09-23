package edu.davidengel.advancedjava;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static java.lang.System.out;

public class StockQuoteApplication {


    /**
     * Main for application service - Prints out stock list data
     * @param args string symbol, string start date, string end date
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {

        String symbol = args[0];
        Date fromDate = new SimpleDateFormat("MM/dd/yyyy").parse(args[1]);
        Date endDate = new SimpleDateFormat("MM/dd/yyyy").parse(args[2]);

        Calendar from = Calendar.getInstance();
        from.setTime(fromDate);
        Calendar end = Calendar.getInstance();
        end.setTime(endDate);

        //use the factory to get a new stockservice implementation
        StockService stockService = StockServiceFactory.getStockService();

        StockQuote stockQuote = stockService.getQuote("CSCO");
        List<StockQuote> stockQuotes = stockService.getQuote("csco", from, end);

        out.println("Single Quote Symbol: " + stockQuote.getStockSymbol() + " Date: " + stockQuote.getDateRecorded());

        out.println("List of Stocks Output:");
        for (StockQuote quote : stockQuotes) {
            out.println("Stock Quote Symbol: " + quote.getStockSymbol() + " Date: " + quote.getDateRecorded() );
        }
    }

    /**
     * Creates the stock quote using the stockservice factory for testing
     * @param symbol string stock symbol
     * @return stockquote object
     */
    public static StockQuote createQuote(String symbol)
    {

        //use the factory to get a new stockservice implementation
        StockService stockService = StockServiceFactory.getStockService();

        return stockService.getQuote(symbol);

    }

    /**
     * Creates the stock quote list using the stockservice factory for testing
     * @param symbol stock symbol
     * @param fromDate date of start range
     * @param endDate date of end range
     * @return list of stock quotes in the range
     */
    public static List<StockQuote> createQuotes(String symbol, Date fromDate, Date endDate) {

        Calendar from = Calendar.getInstance();
        from.setTime(fromDate);
        Calendar end = Calendar.getInstance();
        end.setTime(endDate);
        //use the factory to get a new stockservice implementation
        StockService stockService = StockServiceFactory.getStockService();

        return stockService.getQuote(symbol, from, end);
    }
}
