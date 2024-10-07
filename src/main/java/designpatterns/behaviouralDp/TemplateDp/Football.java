package designpatterns.behaviouralDp.TemplateDp;

public class Football extends Game{
    @Override
    protected void initializeGame() {
        System.out.println("We are in football ground");
    }

    @Override
    protected void playing() {
        System.out.println("We are playing football");
    }

    @Override
    protected void showResult() {
        System.out.println("Football is the game we are playing");
    }
}
