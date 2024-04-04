package org.example.chapter04;

public abstract class Figure {

    private int x;
    private int y;
    private int width;
    private int height;
    private Bounds bounds = new Bounds();


    public void changeSize() {
        bounds.set(x, y, width, height);
    }

    public boolean contains(Point point){
        return  bounds.contains(point.getX() ,point.getY());
    }
}
