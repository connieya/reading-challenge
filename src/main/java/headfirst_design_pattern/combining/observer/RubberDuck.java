package headfirst_design_pattern.combining.observer;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("삑삑");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
