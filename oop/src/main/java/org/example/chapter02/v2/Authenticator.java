package org.example.chapter02.v2;


import org.example.chapter02.Member;

public class Authenticator {

    public void authenticate(String id , String password) {
        Member m = findMemberById(id);
        if (m==null) throw new MemberNotFoundException();
        if (!m.equalPassword(password)) throw new InvalidPasswordException();
    }


    private Member findMemberById(String id) {
        return null;
    }
}
