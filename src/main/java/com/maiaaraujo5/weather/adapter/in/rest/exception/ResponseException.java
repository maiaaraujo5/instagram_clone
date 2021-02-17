package com.maiaaraujo5.weather.adapter.in.rest.exception;

import lombok.Getter;

@Getter
public class ResponseException {
    private final String status;
    private final String message;

    public ResponseException(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
