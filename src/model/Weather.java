package model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by christerhansen on 19.03.14.
 */
public class Weather {

    String id;
    String to;
    String from;
    String rain;
    String temperature;
    String humidity;
    String pressure;
    String cloudiness;
    String fog;
    String lowClouds;
    String mediumClouds;
    String highClouds;
    String temperatureProbability;
    String dewpointTemperature;
    WindDirection windDirection;
    WindSpeed windSpeed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(String cloudiness) {
        this.cloudiness = cloudiness;
    }

    public String getFog() {
        return fog;
    }

    public void setFog(String fog) {
        this.fog = fog;
    }

    public String getLowClouds() {
        return lowClouds;
    }

    public void setLowClouds(String lowClouds) {
        this.lowClouds = lowClouds;
    }

    public String getMediumClouds() {
        return mediumClouds;
    }

    public void setMediumClouds(String mediumClouds) {
        this.mediumClouds = mediumClouds;
    }

    public String getHighClouds() {
        return highClouds;
    }

    public void setHighClouds(String highClouds) {
        this.highClouds = highClouds;
    }

    public String getTemperatureProbability() {
        return temperatureProbability;
    }

    public void setTemperatureProbability(String temperatureProbability) {
        this.temperatureProbability = temperatureProbability;
    }

    public String getDewpointTemperature() {
        return dewpointTemperature;
    }

    public void setDewpointTemperature(String dewpointTemperature) {
        this.dewpointTemperature = dewpointTemperature;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(WindDirection windDirection) {
        this.windDirection = windDirection;
    }

    public WindSpeed getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(WindSpeed windSpeed) {
        this.windSpeed = windSpeed;
    }
}
