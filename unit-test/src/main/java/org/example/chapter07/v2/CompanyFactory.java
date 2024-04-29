package org.example.chapter07.v2;

public class CompanyFactory {
    public static Company create(Object[] companyData) {
        return new Company();
    }
}
