package pattern_observer;

public interface StockMarket {
    void attach(Investor observer);
    void detach(Investor observer);
    void notifyObservers();
}
