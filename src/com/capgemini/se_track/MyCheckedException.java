package com.capgemini.se_track;

public class MyCheckedException extends Exception {

    public MyCheckedException() {
        super();
    }

    public MyCheckedException(String errorMessage) {
        super(errorMessage);
    }

    public MyCheckedException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
