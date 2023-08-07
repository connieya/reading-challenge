package pattern_observer;

public class ConcreteInvestor implements Investor {

    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(name + "님, 주식 시세가 " + stockPrice + "로 변경되었습니다.");
    }
}
