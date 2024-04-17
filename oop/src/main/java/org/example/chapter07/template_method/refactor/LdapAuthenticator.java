package org.example.chapter07.template_method.refactor;

import org.example.chapter07.template_method.Auth;
import org.example.chapter07.template_method.Authenticator;
import org.example.chapter07.template_method.LdapClient;
import org.example.chapter07.template_method.LdapContext;

public class LdapAuthenticator extends Authenticator {

    private LdapClient ldapClient;
    @Override
    protected boolean doAuthenticate(String id, String pw) {
        return ldapClient.authenticate(id,pw);
    }

    @Override
    protected Auth createAuth(String id) {
        LdapContext ctx = ldapClient.find(id);
        return new Auth(id, ctx.getAttribute("name"));
    }
}
