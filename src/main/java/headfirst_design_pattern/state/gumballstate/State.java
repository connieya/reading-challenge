package headfirst_design_pattern.state.gumballstate;

public interface State {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();


}
