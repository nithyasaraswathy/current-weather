package org.example.currentweather.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.currentweather.ResponseMapper.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/weather")
    public String getWeather(@RequestParam double latitude, @RequestParam double longitude) throws JsonProcessingException {
        String openMetroUrl = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude + "&longitude=" + longitude + "&current=temperature_2m";
        WeatherResponse weatherResponse = restTemplate.getForObject(openMetroUrl, WeatherResponse.class);
        return weatherResponse.getCurrent().getCurrentTemperature() + " " + weatherResponse.getCurrentUnits().getCurrentTemperatureUnit();
    }
}
