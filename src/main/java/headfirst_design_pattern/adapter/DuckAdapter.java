package headfirst_design_pattern.adapter;

public class DuckAdapter implements Turkey{
    Duck duck;


    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly()
    {

    }
}
