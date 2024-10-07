package designpatterns.behaviouralDp.ObserverDp;

public class App {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();
        stockExchange.addObservers(new BuyStockListener());
        stockExchange.addObservers(new SellStockListener());
        stockExchange.start();
    }
}
