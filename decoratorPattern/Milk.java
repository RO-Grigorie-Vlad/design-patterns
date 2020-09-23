package decoratorPattern;

public class Milk extends Beverage{

    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 1;
    }
    
}
