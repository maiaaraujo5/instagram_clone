package com.maiaaraujo5.weather.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class WeatherAlerts {
    private String SenderName;
    private String event;
    private Date startAt;
    private Date endsAt;
    private String description;
}
