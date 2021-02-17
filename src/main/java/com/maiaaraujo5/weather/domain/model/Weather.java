package com.maiaaraujo5.weather.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Weather {
    private Date date;
    private Date sunrise;
    private Date sunset;
    private double temperature;
    private double feelsLike;
    private int humidity;
}

