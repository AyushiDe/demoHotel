
package com.ayushi.demo.dto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class SearchHotelsResDto {

    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("pageSize")
    @Expose
    private Integer pageSize;
    @SerializedName("totalSize")
    @Expose
    private Integer totalSize;
    @SerializedName("marketSize")
    @Expose
    private Integer marketSize;
    @SerializedName("sortType")
    @Expose
    private String sortType;
    @SerializedName("tripFilterSummary")
    @Expose
    private TripFilterSummary tripFilterSummary;
    @SerializedName("cityInfo")
    @Expose
    private CityInfo cityInfo;
    @SerializedName("hotels")
    @Expose
    private List<Hotel> hotels = null;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public Integer getMarketSize() {
        return marketSize;
    }

    public void setMarketSize(Integer marketSize) {
        this.marketSize = marketSize;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public TripFilterSummary getTripFilterSummary() {
        return tripFilterSummary;
    }

    public void setTripFilterSummary(TripFilterSummary tripFilterSummary) {
        this.tripFilterSummary = tripFilterSummary;
    }

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

}
