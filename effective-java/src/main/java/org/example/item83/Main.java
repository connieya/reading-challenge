package org.example.item83;

public class Main {

    private static class FieldHolder {
        static final FieldType field = computeFieldValue();




        private static FieldType computeFieldValue() {
            return null;
        }
    }

    private static FieldType getField(){
        return FieldHolder.field;
    }
}
