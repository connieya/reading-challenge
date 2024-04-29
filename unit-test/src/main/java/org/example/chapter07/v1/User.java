package org.example.chapter07.v1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private int userId;
    private String email;
    private UserType userType;

    public void changeEmail(int userId, String newEmail) {
        Object[] data = Database.getUserById(userId);
        this.userId = userId;
        this.email = (String) data[0];
        this.userType = (UserType) data[1];

        if (email.equals(newEmail))
            return;

        Object[] companyData = Database.getCompany();

        String companyDomainName = (String) companyData[0];
        int numberOfEmployees = (int) companyData[1];

        String emailDomain = newEmail.split("@")[1];
        boolean isEmailCorporate = emailDomain == companyDomainName;

        UserType newType = isEmailCorporate ? userType.EMPLOYEE : userType.CUSTOMER;

        if (userType != newType) {
            int delta = newType == UserType.EMPLOYEE ? 1 : -1;
            int newNumber = numberOfEmployees + delta;
            Database.saveCompany(newNumber);
        }

        this.email = newEmail;
        this.userType = newType;

        Database.saveUser(this);
        MessageBus.sendEmailChangedMessage(userId, newEmail);


    }
}
