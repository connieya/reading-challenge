package org.example.chapter07.template_method;

public abstract class Authenticator {

    // 템플릿 메서드
    public Auth authenticate(String id , String pw) {
        if (!doAuthenticate(id , pw))
            throw  createException();

        return createAuth(id);
    }

    protected abstract boolean doAuthenticate(String id, String pw);

    protected RuntimeException createException() {
        return new AuthException();
    }

    protected abstract Auth createAuth(String id);
}
