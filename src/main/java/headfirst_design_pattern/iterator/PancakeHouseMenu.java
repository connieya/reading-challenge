package headfirst_design_pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B 팬케이크 세트" , "스크램블 에그와 토스트가 곁들어진 팬케이크" ,false ,2.99);

        addItem("레큘러 팬케이크 세트" , "달걀 프라이와 소시지가 곁들여진 팬케이크" , false , 2.99);

        addItem("블루베리 팬케이크" , "신선한 블루베리와 시럽으로 만든 케이크",true,3.49);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
