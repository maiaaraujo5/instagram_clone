package com.maiaaraujo5.weather.adapter.out.weatherService.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ForecastWeather {
    @JsonProperty(value = "dt")
    private Date date;
    private Date sunrise;
    private Date sunset;
    @JsonProperty(value = "temp")
    private Temperature temperature;
    @JsonProperty(value = "feels_like")
    private FeelsLike feelsLike;
    @JsonProperty("weather")
    private List<Condition> condition;
    private int humidity;
}
