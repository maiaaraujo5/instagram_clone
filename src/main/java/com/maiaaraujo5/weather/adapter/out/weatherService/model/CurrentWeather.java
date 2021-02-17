package com.maiaaraujo5.weather.adapter.out.weatherService.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class CurrentWeather {
    @JsonProperty(value = "dt")
    private Date date;
    private Date sunrise;
    private Date sunset;
    private double temp;
    @JsonProperty(value = "feels_like")
    private double feelsLike;
}
