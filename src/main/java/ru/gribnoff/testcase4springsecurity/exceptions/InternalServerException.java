package ru.gribnoff.testcase4springsecurity.exceptions;

public class InternalServerException extends AbstractInnerException {
    public InternalServerException(String msg) {
        super(msg);
    }

    public InternalServerException(String msg, int errorCode) {
        super(msg, errorCode);
    }
}
