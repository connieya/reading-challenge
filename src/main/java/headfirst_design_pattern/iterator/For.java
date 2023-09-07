package headfirst_design_pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class For {
    public static void main(String[] args) {
        List<MenuItem> menu = new ArrayList<>();

        for (MenuItem menuItem : menu) {
            System.out.print(menuItem.getName()+" , ");
            System.out.print(menuItem.getPrice()+ " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
