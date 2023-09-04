package headfirst_design_pattern.template;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {
    private String [] myList;

    MyStringList(String [] strings) {
        myList = strings;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return 0;
    }

    public String set(int index, String item) {
        String oldString = myList[index];
        myList[index] = item;
        return oldString;
    }
}
