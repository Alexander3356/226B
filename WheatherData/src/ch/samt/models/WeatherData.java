package ch.samt.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class WeatherData {
    private String city;
    private LocalDate  date;
    private double temperature;
    private double precipitation;
    private double humidity;

    public WeatherData(String city, LocalDate date, double temperature, double precipitation, double humidity) {
        this.city = city;
        this.date = date;
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.humidity = humidity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return  city + " - " + date + " - " + temperature + "°C";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        WeatherData that = (WeatherData) o;
        return Double.compare(temperature, that.temperature) == 0 && Double.compare(precipitation, that.precipitation) == 0 && Double.compare(humidity, that.humidity) == 0 && Objects.equals(city, that.city) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, date, temperature, precipitation, humidity);
    }
}
