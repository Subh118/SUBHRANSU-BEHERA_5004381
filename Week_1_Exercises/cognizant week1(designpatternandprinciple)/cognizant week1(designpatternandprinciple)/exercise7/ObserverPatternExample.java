package exercise7;

// ObserverPatternExample.java
public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Setting stock price to 100.0");
        stockMarket.setStockPrice(100.0);

        System.out.println("\nSetting stock price to 105.5");
        stockMarket.setStockPrice(105.5);

        System.out.println("\nRemoving MobileApp from observers");
        stockMarket.removeObserver(mobileApp);

        System.out.println("\nSetting stock price to 110.0");
        stockMarket.setStockPrice(110.0);
    }
}

