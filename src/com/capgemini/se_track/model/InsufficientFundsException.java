package com.capgemini.se_track.model;

public class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException(double funds, double required) {
        super("The amount of money (" + funds + ") is less than the required amount of (" + required + ")");
    }
}
