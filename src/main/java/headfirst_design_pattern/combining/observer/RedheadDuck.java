package headfirst_design_pattern.combining.observer;

public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
