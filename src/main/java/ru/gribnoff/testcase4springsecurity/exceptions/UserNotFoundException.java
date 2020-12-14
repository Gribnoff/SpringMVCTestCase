package ru.gribnoff.testcase4springsecurity.exceptions;

public class UserNotFoundException extends AbstractInnerException {
    public UserNotFoundException(String msg) {
        super(msg);
    }

    public UserNotFoundException(String msg, int errorCode) {
        super(msg, errorCode);
    }
}
