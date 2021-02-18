package com.maiaaraujo5.weather.adapter.in.rest;

import com.maiaaraujo5.weather.adapter.out.weatherService.exception.BadRequestException;
import com.maiaaraujo5.weather.domain.model.Weather;
import com.maiaaraujo5.weather.port.in.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(WeatherController.class)
class WeatherControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WeatherService weatherService;

    @Test
    public void should_return_successfully_forecast_temperatures() throws Exception {
        Weather weather = new Weather(new Date(), new Date(), new Date(), 42.6, 45.9, 9);
        List<Weather> weatherList = Collections.singletonList(weather);
        given(weatherService.getWeather(Mockito.anyDouble(), Mockito.anyDouble())).willReturn(weatherList);

        mockMvc.perform(get("/v1/weather?latitude=1234&longitude=1234")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].temperature", is(42.6)))
                .andExpect(jsonPath("$[0].feels_like", is(45.9)))
                .andExpect(jsonPath("$[0].humidity", is(9)));
    }

    @Test
    public void should_return_status_code_bad_request_when_service_throw_bad_request() throws Exception {
        given(weatherService.getWeather(1234, 1234)).willThrow(BadRequestException.class);

        mockMvc.perform(get("/v1/weather?latitude=1234&longitude=1234")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.status", is("BAD_REQUEST")));
    }


}