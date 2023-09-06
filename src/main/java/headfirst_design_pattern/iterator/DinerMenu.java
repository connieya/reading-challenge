package headfirst_design_pattern.iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식 주의자용 BLT" , "통밀 위에 콩고기 베이컨 , 상추 , 토마토를 얹은 메뉴", true, 2.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if (numberOfItems >= MAX_ITEMS){
            System.out.println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
    // 더 이상 필요 없다. 내부 구조를 다 드러내는 단점이 있어서 없애는게 낫다.
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

//    public Iterator createIterator(){
//        return new DinerMenuIterator(menuItems);
//    }
}
