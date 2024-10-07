package designpatterns.behaviouralDp.TemplateDp;

public class Basketball extends Game{
    @Override
    protected void initializeGame() {
        System.out.println("We are in basket ball court");
    }

    @Override
    protected void playing() {
        System.out.println("Playing basketball");
    }

    @Override
    protected void showResult() {
        System.out.println("Basket ball is the game we are playing");
    }
}
