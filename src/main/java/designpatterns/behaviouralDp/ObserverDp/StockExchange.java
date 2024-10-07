package designpatterns.behaviouralDp.ObserverDp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Subject{

    private float price = 100;
    private Random random;
    private List<Observer> observerList;

    public StockExchange(){
        random = new Random();
        observerList = new ArrayList<>();
    }
    @Override
    public void addObservers(Observer o) {
        observerList.add(o);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o : observerList){
            o.update(price);
        }
    }

    public void start(){
        while (true){
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            price = price + 2 * random.nextFloat() - 1;
            notifyAllObservers();
            System.out.println(price);
        }
    }
}
