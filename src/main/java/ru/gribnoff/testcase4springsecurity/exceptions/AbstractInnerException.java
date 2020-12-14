package ru.gribnoff.testcase4springsecurity.exceptions;

public class AbstractInnerException extends RuntimeException {
    protected int errorCode;

    public AbstractInnerException(String msg) {
        super(msg);
    }

    public AbstractInnerException(String msg, int errorCode) {
        super(msg);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
