package headfirst_design_pattern.iterator;

import java.util.List;

public class PancakeHouseIterator implements Iterator{
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) return false;
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
