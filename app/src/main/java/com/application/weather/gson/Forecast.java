package com.application.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author wangrui
 * @date 2021/3/23 9:47
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

}
