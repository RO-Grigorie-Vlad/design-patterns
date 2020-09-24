package factoryMethodPattern;

public class AnimalFactory {
    
    //creates a random Animal: a dog or a cat
    public Animal createAnimal(){
        int randomNumber = (int) (Math.random() * ((2 - 1) + 1)) + 1;
        if(randomNumber == 1){
            return new Cat();
        }
        else{
            return new Dog();
        }
    };

}
