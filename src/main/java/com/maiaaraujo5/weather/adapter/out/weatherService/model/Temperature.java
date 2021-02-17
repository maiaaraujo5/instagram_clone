package com.maiaaraujo5.weather.adapter.out.weatherService.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Temperature {
    private double day;
    private double min;
    private double max;
    private double night;
    private double eve;
    private double morn;
}
