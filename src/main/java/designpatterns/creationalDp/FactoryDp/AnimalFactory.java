package designpatterns.creationalDp.FactoryDp;

public class AnimalFactory {

    public static Animal getAnimal(AnimalType animalType){
        if(animalType == AnimalType.CAT){
            return new Cat();
        } else if (animalType == AnimalType.DOG) {
            return new Dog();
        } else if (animalType == AnimalType.TIGER) {
            return new Tiger();
        }else {
            return null;
        }
    }
}
