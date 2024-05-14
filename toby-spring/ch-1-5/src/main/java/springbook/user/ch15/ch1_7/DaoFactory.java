package springbook.user.ch15.ch1_7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springbook.user.ch15.dao.ConnectionMaker;
import springbook.user.ch15.dao.DConnectionMaker;
import springbook.user.ch15.dao.UserDao;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }
    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
