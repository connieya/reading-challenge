package pattern_decorator;

public class Decaf extends Beverage{

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
