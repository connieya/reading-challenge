package org.example.chapter07.template_method;

public class DbAuthenticator {

    private  UserDao userDao;
    public Auth authenticate(String id, String pw) {
        User user = userDao.selectById(id);
        boolean auth = user.equalPassword(pw);
        if (!auth) {
//            throw createException();
        }
        return new Auth(id,user.getName());
    }

    private AuthException createException() {
        return new AuthException();
    }
}
