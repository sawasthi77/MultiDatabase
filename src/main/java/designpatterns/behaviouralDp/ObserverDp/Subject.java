package designpatterns.behaviouralDp.ObserverDp;

public interface Subject {
    public void addObservers(Observer o);
    public void notifyAllObservers();
}
