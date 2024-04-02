package org.example.chapter02;


public class Authenticator {

    public boolean authenticate(String id , String password) {
        Member m = findMemberById(id);
        if (m==null)return false;
        return m.equalPassword(password);
    }


    private Member findMemberById(String id) {
        return null;
    }
}
