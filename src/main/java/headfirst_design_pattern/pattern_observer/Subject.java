package headfirst_design_pattern.pattern_observer;



public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}


