package com.maiaaraujo5.weather.domain.service;

import com.maiaaraujo5.weather.domain.model.Weather;
import com.maiaaraujo5.weather.port.in.WeatherService;
import com.maiaaraujo5.weather.port.out.WeatherServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherServiceImplementation implements WeatherService {

    private final WeatherServiceClient weatherService;

    @Autowired
    public WeatherServiceImplementation(WeatherServiceClient weatherService) {
        this.weatherService = weatherService;
    }


    @Override
    public List<Weather> getWeather(double latitude, double longitude) {
        return this.weatherService.getWeather(latitude, longitude);
    }
}
