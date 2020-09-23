package decoratorPattern;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Beverage beverage = new Milk(new Caramel(new Expresso()));
        System.out.println("The final cost is: " + beverage.cost());
    }

}
