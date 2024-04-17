package org.example.chapter07.template_method;

public class User {
    private String name;
    public boolean equalPassword(String pw) {
        return false;
    }

    public String getName() {
        return name;
    }
}
