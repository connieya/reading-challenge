package org.example.chapter07.template_method;

public class LdapAuthenticator {

    private  LdapClient ldapClient;
    public Auth authenticate(String id, String pw) {

        boolean auth = ldapClient.authenticate(id,pw);
        if (!auth) {
//            throw createException();
        }
        LdapContext ctx = ldapClient.find(id);
        return new Auth(id,ctx.getAttribute("name"));
    }

    private AuthException createException() {
        return new AuthException();
    }
}
