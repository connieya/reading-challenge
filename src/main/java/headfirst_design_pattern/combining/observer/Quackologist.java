package headfirst_design_pattern.combining.observer;

public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("꽥꽥하자 : "+duck + " 가 방금 소리 냈다.");
    }
}
