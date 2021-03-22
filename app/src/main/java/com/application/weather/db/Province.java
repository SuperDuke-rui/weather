package com.application.weather.db;

import org.litepal.crud.DataSupport;

/**
 * @author wangrui
 * @date 2021/3/22 15:07
 *
 * 省
 */
public class Province extends DataSupport {
    /**
     * 每个实体类都应该有的字段
     */
    private int id;

    /**
     * 省的名字
     */
    private String provinceName;

    /**
     * 省的代号
     */
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
