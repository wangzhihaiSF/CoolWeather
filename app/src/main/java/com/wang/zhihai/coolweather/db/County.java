package com.wang.zhihai.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 王治海 on 2018/4/10.
 */
public class County extends DataSupport {
    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {
        return weatherId;
    }

    public void setCountyCode(int countyCode) {
        this.weatherId = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
