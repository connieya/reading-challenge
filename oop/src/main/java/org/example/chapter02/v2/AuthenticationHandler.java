package org.example.chapter02.v2;


public class AuthenticationHandler {

    public void handleRequest(String inputId, String inputPassword) {
        Authenticator auth = new Authenticator();
        try {
            auth.authenticate(inputId,inputPassword);
            // 아이디/암호가 일치하는 경우 처리
        }catch (MemberNotFoundException ex) {
            // 아이디가 잘못된 경우의 처리
        }catch (InvalidPasswordException ex) {
            // 암호가 잘못된 경우의 처리
        }
    }
}
