package com.maiaaraujo5.weather.adapter.out.weatherApi;

import com.maiaaraujo5.weather.domain.model.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "weather", url = "api.openweathermap.org/data/2.5/onecall")
public interface ApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/stores")
    List<Weather> getWeather();
}
