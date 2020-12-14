package ru.gribnoff.testcase4springsecurity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gribnoff.testcase4springsecurity.exceptions.IncorrectPasswordException;
import ru.gribnoff.testcase4springsecurity.exceptions.InternalServerException;
import ru.gribnoff.testcase4springsecurity.exceptions.UserNotFoundException;
import ru.gribnoff.testcase4springsecurity.persistence.entity.Login;
import ru.gribnoff.testcase4springsecurity.persistence.entity.User;
import ru.gribnoff.testcase4springsecurity.persistence.repository.UserDAO;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserDAO userDao;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public int register(User user) {
        int result;
        try {
            result = userDao.register(user);
        } catch (Exception e) {
            throw new InternalServerException("Something went wrong!", 2);
        }

        return result;
    }

    @Override
    public User validateUser(Login login) {
        User user;
        try {
            user = findByUsername(login.getUsername());
        } catch (Exception e) {
            throw new InternalServerException("Something went wrong!", 2);
        }

        if (user == null)
            throw new UserNotFoundException("Username not found", 3);
        else if (!user.getPassword().equals(login.getPassword()))
            throw new IncorrectPasswordException("Incorrect password", 4);

        return user;
    }
}
