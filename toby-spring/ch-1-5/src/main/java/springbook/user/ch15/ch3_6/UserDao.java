package springbook.user.ch15.ch3_6;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void add(final User user) throws SQLException {

    }

    public void deleteAll() throws SQLException {
        this.jdbcTemplate.update(
                new PreparedStatementCreator() {
                    @Override
                    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                        return con.prepareStatement("delete from users");
                    }
                }
        );
    }

//    public int getCount() throws SQLException  {
//       return this.jdbcTemplate.query(new PreparedStatementCreator() {
//           @Override
//           public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//               return con.prepareStatement("select count(*) from users");
//           }
//       }, new ResultSetExtractor<Integer>() {
//           @Override
//           public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
//               rs.next();
//               return rs.getInt(1);
//           }
//       });
//    }





}
