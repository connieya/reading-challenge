package headfirst_design_pattern.combining.observer;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("꽉꽉");
    }
}
