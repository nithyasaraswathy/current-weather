package org.example.currentweather.ResponseMapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current {
    private String time;
    private int interval;
    @JsonProperty("temperature_2m")
    private double currentTemperature;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    @Override
    public String toString() {
        return "Current{" +
                "time='" + time + '\'' +
                ", interval='" + interval + '\'' +
                ", currentTemperature='" + currentTemperature + '\'' +
                '}';
    }
}
