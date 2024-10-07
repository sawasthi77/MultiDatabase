package designpatterns.behaviouralDp.StrategyDp;

public class SmartPhoneRenderer implements Strategy{
    @Override
    public void showImage() {
        System.out.println("Showing image on Smart Phone");
    }
}
