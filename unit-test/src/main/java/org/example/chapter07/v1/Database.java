package org.example.chapter07.v1;

public interface Database {
    static Object[] getUserById(int userId) {
        return new Object[0];
    }

    static Object[] getCompany() {
        return new Object[0];
    }

    static void saveCompany(int newNumber) {
    }

    static void saveUser(User user) {
    }
}
