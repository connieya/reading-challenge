package org.example.chapter07.v2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private int userId;
    private String email;
    private UserType userType;
    private boolean isEmailConfirmed;

    public User(int userId, String email, UserType userType) {
        this.userId = userId;
        this.email = email;
        this.userType = userType;
    }


    public String changeEmail(String newEmail, Company company) {
        if (isEmailConfirmed)
            return "Can't change a confirmed email";


        if (email.equals(newEmail)) {
            return "bad";
        }

        UserType newType = company.isEmailCorporate(newEmail) ? userType.EMPLOYEE : userType.CUSTOMER;

        if (userType != newType) {
            int delta = newType == UserType.EMPLOYEE ? 1 : -1;
           company.changeNumberOfEmployees(delta);
        }
        email = newEmail;
        userType = newType;

        return "ok";
    }
}
