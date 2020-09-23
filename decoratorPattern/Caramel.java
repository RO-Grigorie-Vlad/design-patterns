package decoratorPattern;

public class Caramel extends Condiment{
    
    private Beverage beverage;

    public Caramel(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }
}
