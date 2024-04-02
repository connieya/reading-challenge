package org.example.chapter02;

public class AuthenticationHandler {

    public void handleRequest(String inputId, String inputPassword) {
        Authenticator auth = new Authenticator();
        if (auth.authenticate(inputId,inputPassword)){
            //
        }else {
            //
        }
    }
}
