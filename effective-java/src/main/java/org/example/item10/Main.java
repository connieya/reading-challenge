package org.example.item10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        System.out.println("cis.equals(s) = " + cis.equals(s));
        System.out.println("s.equals(cis) = " + s.equals(cis));

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);
        
        String ss = "Polish";

        System.out.println("list.contains(s) = " + list.contains(s));
        System.out.println("list.contains(ss) = " + list.contains(ss));

        Point p = new Point(1,2);
        ColorPoint cp = new ColorPoint(1,2,Color.RED);
        System.out.println("p.equals(cp) = " + p.equals(cp));
        System.out.println("cp.equals(p) = " + cp.equals(p));

        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1,2);
        ColorPoint p3 = new ColorPoint(1,2,Color.BLUE);
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p2.equals(p3) = " + p2.equals(p3));
        System.out.println("p1.equals(p3) = " + p1.equals(p3));
    }

    @Override
    public boolean equals(Object obj) {
        throw new AssertionError();
    }
}
