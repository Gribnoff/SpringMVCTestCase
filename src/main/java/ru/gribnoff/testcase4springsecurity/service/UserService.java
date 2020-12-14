package ru.gribnoff.testcase4springsecurity.service;

import ru.gribnoff.testcase4springsecurity.persistence.entity.Login;
import ru.gribnoff.testcase4springsecurity.persistence.entity.User;

public interface UserService {
    User findByUsername(String username);
    int register(User user);
    User validateUser(Login login);
}
