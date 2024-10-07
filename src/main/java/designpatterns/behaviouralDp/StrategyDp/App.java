package designpatterns.behaviouralDp.StrategyDp;

public class App {
    public static void main(String[] args) {
        ImageManager imageManager = new ImageManager();
        imageManager.setStrategy(new SmartPhoneRenderer());
        imageManager.showImage();
    }
}
