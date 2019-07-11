package com.skb.fitday.springboot.exception;

public class NuguException extends RuntimeException {

    String message;

    public NuguException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
