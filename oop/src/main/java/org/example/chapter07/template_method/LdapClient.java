package org.example.chapter07.template_method;

public class LdapClient {
    public boolean authenticate(String id, String pw) {
        return false;
    }

    public LdapContext find(String id) {
        return null;
    }
}
