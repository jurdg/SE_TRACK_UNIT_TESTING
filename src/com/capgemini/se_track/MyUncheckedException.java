package com.capgemini.se_track;

public class MyUncheckedException extends RuntimeException {

    public MyUncheckedException() {
        super();
    }

    public MyUncheckedException(String errorMessage) {
        super(errorMessage);
    }

    public MyUncheckedException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

}
