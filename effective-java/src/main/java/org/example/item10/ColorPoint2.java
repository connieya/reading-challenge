package org.example.item10;

import java.util.Objects;

public class ColorPoint2 {
    private final Point point;
    private final Color color;

    public ColorPoint2(int x, int y, Color color){
        point = new Point(x,y);
        this.color = Objects.requireNonNull(color);
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint2))
            return false;
        ColorPoint2 cp = (ColorPoint2) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
