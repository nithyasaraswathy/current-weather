package org.example.currentweather.ResponseMapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class WeatherResponse {
    double latitude;
    double longitude;
    @JsonProperty("generationtime_ms")
    double generationTime;
    @JsonProperty("utc_offset_seconds")
    int utcOffsetSeconds;
    String timezone;
    @JsonProperty("timezone_abbreviation")
    String timezoneAbbreviation;
    double elevation;
    @JsonProperty("current_units")
    CurrentUnits currentUnits;
    Current current;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getGenerationTime() {
        return generationTime;
    }

    public void setGenerationTime(double generationTime) {
        this.generationTime = generationTime;
    }

    public int getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    public void setUtcOffsetSeconds(int utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    public void setTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public CurrentUnits getCurrentUnits() {
        return currentUnits;
    }

    public void setCurrentUnits(CurrentUnits currentUnits) {
        this.currentUnits = currentUnits;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", generationTime=" + generationTime +
                ", utcOffsetSeconds=" + utcOffsetSeconds +
                ", timezone='" + timezone + '\'' +
                ", timezoneAbbreviation='" + timezoneAbbreviation + '\'' +
                ", elevation=" + elevation +
                ", currentUnits=" + currentUnits +
                ", current=" + current +
                '}';
    }
}
