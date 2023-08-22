package headfirst_design_pattern.pattern_decorator;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() +.15;
    }

    @Override
    public String getDescription() {
        return beverage.description +" , 두유";
    }
}
