package ru.gribnoff.testcase4springsecurity.persistence.repository;

import ru.gribnoff.testcase4springsecurity.persistence.entity.Login;
import ru.gribnoff.testcase4springsecurity.persistence.entity.User;

public interface UserDAO {
    User findByUsername(String username);
    int register(User user);
    int validateUser(Login login);
}
