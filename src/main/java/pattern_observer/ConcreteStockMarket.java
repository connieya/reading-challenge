package pattern_observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStockMarket implements StockMarket {
    private List<Investor> observers = new ArrayList<>();
    private double stockPrice;

    @Override
    public void attach(Investor observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Investor observer) {
        observers.remove(observer);
    }


    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Investor observer : observers) {
            observer.update(stockPrice);
        }
    }
}
