package org.example.item90;

import java.io.Serializable;
import java.util.Date;

public class Main {
    private static class SerializationProxy implements Serializable {
        private final Date start;
        private final Date end;

        SerializationProxy(org.example.item90.Period p) {
            this.start = p.start();
            this.end = p.end();
        }
    }
}
