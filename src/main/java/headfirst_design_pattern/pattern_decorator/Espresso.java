package headfirst_design_pattern.pattern_decorator;

public class Espresso extends Beverage{

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
