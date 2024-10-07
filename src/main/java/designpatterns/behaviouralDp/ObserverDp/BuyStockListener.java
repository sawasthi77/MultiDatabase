package designpatterns.behaviouralDp.ObserverDp;

public class BuyStockListener implements Observer{
    @Override
    public void update(float price) {
        if(price < 95){
            System.out.println("Buying stock because the price is very less");
        }
    }
}
