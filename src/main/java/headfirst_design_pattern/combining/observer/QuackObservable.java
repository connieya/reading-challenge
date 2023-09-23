package headfirst_design_pattern.combining.observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
