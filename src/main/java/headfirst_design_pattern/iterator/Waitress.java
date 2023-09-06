package headfirst_design_pattern.iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
//        java.util.Iterator<java.util.Iterator> pancakeIterator = pancakeHouseMenu.createIterator();
//        java.util.Iterator<java.util.Iterator> dinerIterator = dinerMenu.createIterator();/
        System.out.println("메뉴 \n ---- \n 아침 메뉴");
//        printMenu(pancakeIterator);
        System.out.println("\n 점심 메뉴");
//        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName()+" ,");
            System.out.println(menuItem.getPrice()+" --");
            System.out.println(menuItem.getDescription());
        }
    }
}
