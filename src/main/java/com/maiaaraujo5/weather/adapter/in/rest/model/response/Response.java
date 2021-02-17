package com.maiaaraujo5.weather.adapter.in.rest.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.maiaaraujo5.weather.domain.model.Weather;
import lombok.Getter;

import java.util.Date;

@Getter
public class Response {
    private final Date date;
    private final Date sunrise;
    private final Date sunset;
    private final double temperature;
    @JsonProperty("feels_like")
    private final double feelsLike;
    private final int humidity;

    public Response(Weather weather) {
        this.date = weather.getDate();
        this.sunrise = weather.getSunrise();
        this.sunset = weather.getSunset();
        this.temperature = weather.getTemperature();
        this.feelsLike = weather.getFeelsLike();
        this.humidity = weather.getHumidity();
    }
}