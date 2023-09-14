package headfirst_design_pattern.proxy.gumball;

import java.io.Serializable;

public interface State extends Serializable {
     void insertQuarter();
     void ejectQuarter();
     void turnCrank();
     void dispense();
}
