package com.application.weather.db;

import org.litepal.crud.DataSupport;

/**
 * @author wangrui
 * @date 2021/3/22 15:10
 *
 * 城市
 */
public class City extends DataSupport {
    private int id;

    /**
     * 记录市的名字
     */
    private String cityName;

    /**
     * 市的代号
     */
    private int cityCode;

    /**
     * 当前市所属的省的id值
     */
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
