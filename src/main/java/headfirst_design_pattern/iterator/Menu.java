package headfirst_design_pattern.iterator;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
