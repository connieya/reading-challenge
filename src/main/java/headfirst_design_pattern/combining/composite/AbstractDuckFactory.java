package headfirst_design_pattern.combining.composite;

public abstract class AbstractDuckFactory {
    abstract Quackable createMallardDuck();
    abstract Quackable createRedheadDuck();
    abstract Quackable createDuckCall();
    abstract Quackable createRubberDuck();
}
