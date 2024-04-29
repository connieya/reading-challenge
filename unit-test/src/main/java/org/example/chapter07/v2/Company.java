package org.example.chapter07.v2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company {

    private String domainName;
    private int numberOfEmployees;

    public void changeNumberOfEmployees(int delta) {
        Precondition.Requires(numberOfEmployees+delta >=0);

        numberOfEmployees += delta;
    }

    public boolean isEmailCorporate(String email) {
        String emailDomain = email.split("@")[1];
        return emailDomain.equals(domainName);
    }
}
