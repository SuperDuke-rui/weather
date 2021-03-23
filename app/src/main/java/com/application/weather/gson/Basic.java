package com.application.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author wangrui
 * @date 2021/3/23 9:35
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
