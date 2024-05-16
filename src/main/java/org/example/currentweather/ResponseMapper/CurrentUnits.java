package org.example.currentweather.ResponseMapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentUnits {
    private String time;
    private String interval;
    @JsonProperty("temperature_2m")
    public String currentTemperatureUnit;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getCurrentTemperatureUnit() {
        return currentTemperatureUnit;
    }

    public void setCurrentTemperatureUnit(String currentTemperatureUnit) {
        this.currentTemperatureUnit = currentTemperatureUnit;
    }

    @Override
    public String toString() {
        return "CurrentUnits{" +
                "time='" + time + '\'' +
                ", interval='" + interval + '\'' +
                ", currentTemperatureUnit='" + currentTemperatureUnit + '\'' +
                '}';
    }
}
