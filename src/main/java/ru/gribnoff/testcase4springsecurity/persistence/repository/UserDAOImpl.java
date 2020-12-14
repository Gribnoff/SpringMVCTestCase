package ru.gribnoff.testcase4springsecurity.persistence.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.gribnoff.testcase4springsecurity.persistence.entity.Login;
import ru.gribnoff.testcase4springsecurity.persistence.entity.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SuppressWarnings("SqlResolve")
@Repository
@RequiredArgsConstructor
public class UserDAOImpl implements UserDAO {
    private final DataSource datasource;
    private final JdbcTemplate jdbcTemplate;


    @Override
    public User findByUsername(String username) {
        String sql = "select * from \"users\" where \"username\"='" + username + "'";
        List<User> users = jdbcTemplate.query(sql, new UserMapper());

        return users.size() > 0 ? users.get(0) : null;
    }

    @Override
    public int register(User user) {
        String sql = "insert into \"users\" values(?,?,?,?)";

        return jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), 0., "ROLE_USER");
    }

    @Override
    public int validateUser(Login login) {
        User user = findByUsername(login.getUsername());

        if (user == null)
            return 3;
        else if (!user.getPassword().equals(login.getPassword()))
            return 4;

        return 0;
    }
}

class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int arg1) throws SQLException {
        User user = new User();

        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setBalance(rs.getDouble("balance"));

        return user;
    }
}
