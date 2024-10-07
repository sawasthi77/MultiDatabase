package designpatterns.behaviouralDp.ObserverDp;

public class SellStockListener implements Observer{
    @Override
    public void update(float price) {
        if(price > 105){
            System.out.println("Selling the stock because the price of the stock is very high");
        }
    }
}
