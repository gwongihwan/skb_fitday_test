package com.skb.fitday.springboot.constants;

public enum ErrorConstants {

    BAD_REQUEST_ERROR("400"), INTERNAL_SERVER_ERROR("500");

    private final String code;

    ErrorConstants(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

}
