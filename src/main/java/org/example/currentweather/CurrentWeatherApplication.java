package org.example.currentweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CurrentWeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrentWeatherApplication.class, args);
    }

   @Bean
   RestTemplate getRestTemplate() {
        return new RestTemplate();
   }

}
