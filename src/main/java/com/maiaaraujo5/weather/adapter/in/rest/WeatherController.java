package com.maiaaraujo5.weather.adapter.in.rest;

import com.maiaaraujo5.weather.adapter.in.rest.model.response.Response;
import com.maiaaraujo5.weather.domain.model.Weather;
import com.maiaaraujo5.weather.port.in.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping()
    public ResponseEntity<List<Response>> getWeather(@RequestParam double latitude, @RequestParam double longitude) {

        List<Response> response = new ArrayList<>();

        List<Weather> weatherList = this.weatherService.getWeather(latitude, longitude);

        weatherList.forEach(weather -> {
            response.add(new Response(weather));
        });


        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}