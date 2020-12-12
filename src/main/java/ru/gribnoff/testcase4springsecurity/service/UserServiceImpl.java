package ru.gribnoff.testcase4springsecurity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gribnoff.testcase4springsecurity.persistence.entity.Login;
import ru.gribnoff.testcase4springsecurity.persistence.entity.User;
import ru.gribnoff.testcase4springsecurity.persistence.repository.UserDAO;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserDAO userDao;

    @Override
    public int register(User user) {
        return userDao.register(user);
    }

    @Override
    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }
}
