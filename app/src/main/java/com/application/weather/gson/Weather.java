package com.application.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author wangrui
 * @date 2021/3/23 9:50
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
