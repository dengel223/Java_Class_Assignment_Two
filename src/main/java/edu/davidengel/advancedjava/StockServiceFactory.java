package edu.davidengel.advancedjava;

public class StockServiceFactory {

    /**
     * Factory for sotck service
     * @return the implementation stockservice
     * future logic to determin which stockservice concrete class to use
     */
    public static StockService getStockService() {

        return new BasicStockService();

    }

}
