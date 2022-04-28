
package com.ayushi.demo.dto.hotel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Location {

    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("timeZone")
    @Expose
    private String timeZone;
    @SerializedName("neighborhoodId")
    @Expose
    private String neighborhoodId;
    @SerializedName("neighborhoodName")
    @Expose
    private String neighborhoodName;
    @SerializedName("cityId")
    @Expose
    private Long cityId;
    @SerializedName("zoneId")
    @Expose
    private String zoneId;
    @SerializedName("zoneName")
    @Expose
    private String zoneName;
    @SerializedName("zoneType")
    @Expose
    private String zoneType;
    @SerializedName("encLatLong")
    @Expose
    private String encLatLong;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getNeighborhoodId() {
        return neighborhoodId;
    }

    public void setNeighborhoodId(String neighborhoodId) {
        this.neighborhoodId = neighborhoodId;
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    public void setNeighborhoodName(String neighborhoodName) {
        this.neighborhoodName = neighborhoodName;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public String getEncLatLong() {
        return encLatLong;
    }

    public void setEncLatLong(String encLatLong) {
        this.encLatLong = encLatLong;
    }

}
