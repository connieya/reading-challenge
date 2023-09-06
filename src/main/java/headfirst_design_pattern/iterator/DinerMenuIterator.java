package headfirst_design_pattern.iterator;


import java.util.Iterator;

public class DinerMenuIterator implements Iterable<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }




    @Override
    public Iterator<MenuItem> iterator() {
        return null;
    }
}
