package org.example.item3.v2;

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {}

    public static Elvis getInstance() {
        return INSTANCE;
    }
    public void leaveTheBuilding() {}

}
