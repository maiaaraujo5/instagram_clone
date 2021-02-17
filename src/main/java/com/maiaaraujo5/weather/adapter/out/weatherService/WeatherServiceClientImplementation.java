package com.maiaaraujo5.weather.adapter.out.weatherService;

import com.maiaaraujo5.weather.adapter.out.weatherService.model.Response;
import com.maiaaraujo5.weather.domain.model.Weather;
import com.maiaaraujo5.weather.port.out.WeatherServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WeatherServiceClientImplementation implements WeatherServiceClient {

    private final ApiClient apiClient;

    @Autowired
    public WeatherServiceClientImplementation(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public List<Weather> getWeather(double latitude, double longitude) {
        List<Weather> weatherList = new ArrayList<>();
        String[] exclude = {"minutely", "hourly"};
        Response response = this.apiClient.getWeather(latitude, longitude, "metric", "5024a1f74eacc7f79ce784b621eb0f8f", exclude, "pt_br");

        response.getForecastWeather().forEach(forecastWeather -> {
            weatherList.add(
                    new Weather(
                            forecastWeather.getDate(),
                            forecastWeather.getSunrise(),
                            forecastWeather.getSunset(),
                            forecastWeather.getTemperature().getDay(),
                            forecastWeather.getFeelsLike().getDay(),
                            forecastWeather.getHumidity()));
        });


        return weatherList;
    }
}
