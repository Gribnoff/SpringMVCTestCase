package ru.gribnoff.testcase4springsecurity.persistence.repository;

import ru.gribnoff.testcase4springsecurity.persistence.entity.Login;
import ru.gribnoff.testcase4springsecurity.persistence.entity.User;

public interface UserDAO {
    int register(User user);
    User validateUser(Login login);
}
