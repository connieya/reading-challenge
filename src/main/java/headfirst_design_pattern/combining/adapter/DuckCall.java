package headfirst_design_pattern.combining.adapter;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("꽉꽉");
    }
}
