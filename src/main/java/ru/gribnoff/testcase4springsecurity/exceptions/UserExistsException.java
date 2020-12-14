package ru.gribnoff.testcase4springsecurity.exceptions;

public class UserExistsException extends AbstractInnerException {
    public UserExistsException(String msg) {
        super(msg);
    }

    public UserExistsException(String msg, int errorCode) {
        super(msg, errorCode);
    }
}
