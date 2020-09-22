package strategyPattern;

public class StrategyPatternDemo{

    public static void main(String[] args) {
        
        System.out.println("\nStrategy used : OpperationAdd");
        Context context = new Context(new OpperationAdd());
        System.out.println("5 + 5= " + context.executeStrategy(5,5));

        System.out.println("\nStrategy used : OpperationSubstract");
        context = new Context(new OpperationSubstract());
        System.out.println("5 - 5= " + context.executeStrategy(5,5));

        System.out.println("\nStrategy used : OpperationMultiply");
        context = new Context(new OpperationMultiply());
        System.out.println("5 * 5= " + context.executeStrategy(5,5));

    }

}
