package org.example.chapter02;

import java.util.Date;

public class Member {
    private static final long DAY30 = 1000 * 60 * 60 * 24 * 30;
    private Date expiryDate;
    private boolean male;

    public Date getExpiryDate() {
        return expiryDate;
    }

    public boolean isMale() {
        return male;
    }

    public boolean isExpired(){
        if (male){
            return expiryDate != null && expiryDate.getDate() < System.currentTimeMillis();
        }
        return expiryDate != null && expiryDate.getDate() < System.currentTimeMillis()- DAY30;
    }

    public boolean equalPassword(String password) {
        return false;
    }
}
