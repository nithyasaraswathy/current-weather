package org.example.currentweather;

import org.example.currentweather.Controller.WeatherController;
import org.example.currentweather.ResponseMapper.Current;
import org.example.currentweather.ResponseMapper.CurrentUnits;
import org.example.currentweather.ResponseMapper.WeatherResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class CurrentWeatherApplicationTests {

    MockMvc mockMvc;

    @Mock
    RestTemplate restTemplate;

    @InjectMocks
    WeatherController weatherController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(weatherController).build();
    }

    @Test
    void testGetCurrentWeather() throws Exception {

        WeatherResponse weatherResponse = new WeatherResponse();

        CurrentUnits currentUnits = new CurrentUnits();
        currentUnits.setCurrentTemperatureUnit("°C");
        currentUnits.setInterval("seconds");
        currentUnits.setTime("iso8601");

        Current current = new Current();
        current.setCurrentTemperature(23.6);
        current.setInterval(900);
        current.setTime("2024-05-17T12:15");

        weatherResponse.setCurrentUnits(currentUnits);
        weatherResponse.setCurrent(current);
        when(restTemplate.getForObject("https://some-url.com", WeatherResponse.class)).thenReturn(weatherResponse);
        String result = weatherResponse.getCurrent().getCurrentTemperature() + " " + weatherResponse.getCurrentUnits().getCurrentTemperatureUnit();
        assertEquals(result, 23.6 + " °C");
    }


}
