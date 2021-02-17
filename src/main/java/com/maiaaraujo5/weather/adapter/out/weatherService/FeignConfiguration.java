package com.maiaaraujo5.weather.adapter.out.weatherService;

import com.maiaaraujo5.weather.adapter.out.weatherService.exception.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Bean
    public ErrorDecoder errorDecoder() {
        return new ErrorDecoder();
    }
}
