package headfirst_design_pattern.combining.observer;

public abstract class AbstractDuckFactory {
    abstract Quackable createMallardDuck();
    abstract Quackable createRedheadDuck();
    abstract Quackable createDuckCall();
    abstract Quackable createRubberDuck();
}
