package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import strategyPattern.Context;
import strategyPattern.OpperationAdd;
import strategyPattern.OpperationMultiply;
import strategyPattern.OpperationSubstract;

public class StrategyPatternTest {

    @Test
    public void testOpperationAdd(){
        Context context = new Context(new OpperationAdd());
        assertEquals(10, context.executeStrategy(5,5), "5 + 5 must be 10");
    }
    @Test
    public void testOpperationSubstract(){
        Context context = new Context(new OpperationSubstract());
        assertEquals(0, context.executeStrategy(5,5), "5 - 5 must be 0");
    }
    @Test
    public void testOpperationMultiply(){
        Context context = new Context(new OpperationMultiply());
        assertEquals(25, context.executeStrategy(5,5), "5 x 5 must be 25");
    }
}