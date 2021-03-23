package com.application.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author wangrui
 * @date 2021/3/23 9:40
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
