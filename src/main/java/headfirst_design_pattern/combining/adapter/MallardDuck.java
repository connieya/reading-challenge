package headfirst_design_pattern.combining.adapter;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
