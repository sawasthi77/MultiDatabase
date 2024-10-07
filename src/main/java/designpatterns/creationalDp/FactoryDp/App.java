package designpatterns.creationalDp.FactoryDp;

public class App {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.CAT);
        animal.eat();
    }
}
