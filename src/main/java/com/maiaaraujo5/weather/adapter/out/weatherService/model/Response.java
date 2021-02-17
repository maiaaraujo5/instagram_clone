package com.maiaaraujo5.weather.adapter.out.weatherService.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Response {
    private double lat;
    private double lon;
    private String timezone;
    @JsonProperty(value = "timezone_offset")
    private String timezoneOffset;
    @JsonProperty(value = "current")
    private CurrentWeather currentWeather;
    @JsonProperty(value = "daily")
    private List<ForecastWeather> forecastWeather;

}
