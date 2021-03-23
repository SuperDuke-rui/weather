package com.application.weather.gson;

/**
 * @author wangrui
 * @date 2021/3/23 9:38
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
