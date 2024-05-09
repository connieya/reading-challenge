package org.example.ch1_3;

import org.example.ch1_3.dao.DaoFactory;
import org.example.ch1_3.dao.UserDao;

public class UserDaoTest {
    public static void main(String[] args) {
        UserDao dao = new DaoFactory().userDao();
    }
}
