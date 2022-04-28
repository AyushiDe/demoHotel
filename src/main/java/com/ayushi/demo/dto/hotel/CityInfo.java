
package com.ayushi.demo.dto.hotel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CityInfo {

    @SerializedName("cityId")
    @Expose
    private Long cityId;
    @SerializedName("cityName")
    @Expose
    private String cityName;
    @SerializedName("stateName")
    @Expose
    private String stateName;
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("countryName")
    @Expose
    private String countryName;
    @SerializedName("areaId")
    @Expose
    private Integer areaId;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("zonePolygonInfo")
    @Expose
    private ZonePolygonInfo zonePolygonInfo;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public ZonePolygonInfo getZonePolygonInfo() {
        return zonePolygonInfo;
    }

    public void setZonePolygonInfo(ZonePolygonInfo zonePolygonInfo) {
        this.zonePolygonInfo = zonePolygonInfo;
    }

}
