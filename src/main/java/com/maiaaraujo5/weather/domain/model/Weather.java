package com.maiaaraujo5.weather.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Weather {
    private Date date;
    private Date sunrise;
    private Date sunset;
    private double temperature;
    private double feelsLike;
    private int humidity;
    private List<WeatherAlerts> weatherAlerts;
}

