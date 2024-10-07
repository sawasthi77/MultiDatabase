package designpatterns.behaviouralDp.StrategyDp;

public class LaptopRenderer implements Strategy{
    @Override
    public void showImage() {
        System.out.println("Showing image on Laptop");
    }
}
