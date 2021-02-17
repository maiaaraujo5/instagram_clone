package com.maiaaraujo5.weather.port.in;

import com.maiaaraujo5.weather.domain.model.Weather;

import java.util.List;

public interface WeatherService {
    List<Weather> getWeather(double latitude, double longitude);
}
