package pattern_observer;

public class Main {

    public static void main(String[] args) {
        ConcreteStockMarket stockMarket = new ConcreteStockMarket();
        ConcreteInvestor investor1 = new ConcreteInvestor("John");
        ConcreteInvestor investor2 = new ConcreteInvestor("Alice");

        // 투자자들이 주식 시장을 구독
        stockMarket.attach(investor1);
        stockMarket.attach(investor2);


        // 주식 시세가 변동되면 투자자들에게 알림
        stockMarket.setStockPrice(150);


    }
}
