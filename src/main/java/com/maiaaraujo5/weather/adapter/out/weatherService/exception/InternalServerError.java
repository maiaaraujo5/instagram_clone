package com.maiaaraujo5.weather.adapter.out.weatherService.exception;

import lombok.Getter;

@Getter
public class InternalServerError extends RuntimeException {
    private final String message;

    public InternalServerError(String message) {
        this.message = message;
    }
}
