package com.maiaaraujo5.weather.port.out;

import com.maiaaraujo5.weather.domain.model.Weather;
import java.util.List;

public interface WeatherServiceClient {
    List<Weather> getWeather(double latitude, double longitude);
}
