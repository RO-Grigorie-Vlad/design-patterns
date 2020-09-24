package factoryMethodPattern;

import java.util.List;
import java.util.ArrayList;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        
        List<Animal> animalList = new ArrayList<Animal>();
        AnimalFactory animalFactory = new AnimalFactory();

        for(int i = 0; i < 10; i ++){
            Animal newAnimal = animalFactory.createAnimal();
            System.out.println(newAnimal.speak());
            animalList.add(newAnimal);
        }

    }
}
