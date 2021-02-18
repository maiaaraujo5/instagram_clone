package com.maiaaraujo5.weather.domain.service;

import com.maiaaraujo5.weather.domain.model.Weather;
import com.maiaaraujo5.weather.port.out.WeatherServiceClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherServiceImplementationTest {

    @Mock
    private WeatherServiceClient weatherServiceClient;

    @InjectMocks
    private WeatherServiceImplementation weatherServiceImplementation;

    @Test
    public void should_return_weather_successfully() {
        Weather weather = new Weather(new Date(), new Date(), new Date(), 42.6, 45.9, 9);
        List<Weather> weatherList = Collections.singletonList(weather);
        when(weatherServiceClient.getWeather(anyDouble(), anyDouble())).thenReturn(weatherList);
        List<Weather> weathers = weatherServiceImplementation.getWeather(anyDouble(), anyDouble());
        assertThat(weathers).isNotNull();
    }
}