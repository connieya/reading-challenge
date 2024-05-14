package org.example.ch1_3;

import org.example.ch1_3.dao.DaoFactory;
import org.example.ch1_3.dao.UserDao;

public class UserDaoTest {
    public static void main(String[] args) {
        UserDao dao = new DaoFactory().userDao();

        DaoFactory factory = new DaoFactory();
        UserDao dao1 = factory.userDao();
        UserDao dao2 = factory.userDao();

        System.out.println(dao1);
        System.out.println(dao2);
    }
}
