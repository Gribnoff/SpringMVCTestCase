package ru.gribnoff.testcase4springsecurity.exceptions;

public class IncorrectPasswordException extends AbstractInnerException {
    public IncorrectPasswordException(String msg) {
        super(msg);
    }

    public IncorrectPasswordException(String msg, int errorCode) {
        super(msg, errorCode);
    }
}
