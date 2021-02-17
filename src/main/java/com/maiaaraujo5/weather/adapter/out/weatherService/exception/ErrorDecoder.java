package com.maiaaraujo5.weather.adapter.out.weatherService.exception;
import feign.Response;
import org.springframework.cloud.openfeign.support.FeignUtils;
import org.springframework.http.HttpStatus;

public class ErrorDecoder implements feign.codec.ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        if (response.status() == HttpStatus.BAD_REQUEST.value()) {
           return new BadRequestException(response.reason());
        }

        return new InternalServerError("internal server error");
    }
}
