package com.maiaaraujo5.weather.adapter.out.weatherApi;

import com.maiaaraujo5.weather.domain.model.Weather;
import com.maiaaraujo5.weather.port.out.WeatherAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class WeatherApiImplementation implements WeatherAPI {

    private final ApiClient apiClient;

    @Autowired
    public WeatherApiImplementation(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public List<Weather> getWeather(String latitude, String longitude) {
        return this.apiClient.getWeather();
    }
}
