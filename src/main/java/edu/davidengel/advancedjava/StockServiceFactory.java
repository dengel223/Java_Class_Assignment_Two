package edu.davidengel.advancedjava;

/**
 * This StockServiceFactory is a factory design patternt that returns the implementation of stock services
 *
 * @author David Engel and others
 * @verion 1.0
 * @since 9-15-2018
 */


public class StockServiceFactory {

    /**
     * Factory for stock service
     * @return the implementation stockservice
     * future logic to determine which stockservice concrete class to use
     */
    public static StockService getStockService() {

        return new BasicStockService();

    }

}
