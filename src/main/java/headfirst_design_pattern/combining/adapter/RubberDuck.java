package headfirst_design_pattern.combining.adapter;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
