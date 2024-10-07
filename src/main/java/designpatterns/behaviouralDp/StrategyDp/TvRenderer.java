package designpatterns.behaviouralDp.StrategyDp;

public class TvRenderer implements Strategy{
    @Override
    public void showImage() {
        System.out.println("Showing image on TV");
    }
}
