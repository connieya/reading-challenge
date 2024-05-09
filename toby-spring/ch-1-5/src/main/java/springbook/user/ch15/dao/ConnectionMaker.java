package springbook.user.ch15.dao;

import java.sql.Connection;

public interface ConnectionMaker {

    public Connection makeConnection();
}
