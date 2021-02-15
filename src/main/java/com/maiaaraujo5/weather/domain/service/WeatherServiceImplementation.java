package com.maiaaraujo5.weather.domain.service;

import com.maiaaraujo5.weather.domain.model.Weather;
import com.maiaaraujo5.weather.port.in.WeatherService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherServiceImplementation implements WeatherService {

    @Override
    public List<Weather> getWeather(String latitude, String longitude) {
        List<Weather> weatherList = new ArrayList<>();

        Weather weather = new Weather();
        weather.setTemperature(42.8);
        weather.setFeelsLike(47.9);

        weatherList.add(weather);

        return weatherList;
    }
}
