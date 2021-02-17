package com.maiaaraujo5.weather.adapter.out.weatherService;

import com.maiaaraujo5.weather.adapter.out.weatherService.model.Response;
import com.maiaaraujo5.weather.domain.model.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "weather", url = "api.openweathermap.org")
public interface ApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/data/2.5/onecall")
    Response getWeather(@RequestParam double lat,
                        @RequestParam double lon,
                        @RequestParam String unit,
                        @RequestParam String appid,
                        @RequestParam String[] exclude,
                        @RequestParam String lang
    );
}
