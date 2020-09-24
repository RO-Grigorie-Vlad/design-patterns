package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import decoratorPattern.Beverage;
import decoratorPattern.Caramel;
import decoratorPattern.Expresso;
import decoratorPattern.Milk;

public class DecoratorPatternTest {

    @Test
    public void testPattern(){

        // Expresso costs 5
        // Caramel costs 2
        // Milk costs 1
        // As such, we should get a final cost of 8

        Beverage beverage = new Milk(new Caramel(new Expresso()));
        assertEquals(8,beverage.cost());
    }
}
