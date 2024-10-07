package designpatterns.behaviouralDp.TemplateDp;

public abstract class Game {

    protected abstract void initializeGame();
    protected  abstract void playing();
    protected abstract void showResult();

    public final void playGame(){
        initializeGame();
        playing();
        showResult();
    }
}
