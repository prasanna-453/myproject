package com.neoteric.checkedException;

public class InsufficientBalanceException extends Exception {

    public String message;


    public InsufficientBalanceException(String msg) {
        this.message = msg;
    }
}
