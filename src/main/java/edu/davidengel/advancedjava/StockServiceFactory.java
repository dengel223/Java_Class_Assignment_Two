package edu.davidengel.advancedjava;

import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 * This StockServiceFactory is a factory design pattern that returns the implementation of stock services
 *
 * @author David Engel and others
 * @verion 1.0
 * @since 9-15-2018
 */

@Immutable
public class StockServiceFactory {



    /**
     * Hide constructor
     */
    private StockServiceFactory() {

    }

    /**
     * Factory for stock service
     * @return the implementation stockservice
     * future logic to determine which stockservice concrete class to use
     */
    public static StockService getStockService() {

        return new BasicStockService();

    }

}
