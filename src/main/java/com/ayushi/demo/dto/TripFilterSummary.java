
package com.ayushi.demo.dto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class TripFilterSummary {

    @SerializedName("totalSizeFiltered")
    @Expose
    private Integer totalSizeFiltered;
    @SerializedName("cityCounts")
    @Expose
    private CityCounts cityCounts;
    @SerializedName("clusterCounts")
    @Expose
    private ClusterCounts clusterCounts;
    @SerializedName("amenityCounts")
    @Expose
    private AmenityCounts amenityCounts;
    @SerializedName("starRatingCounts")
    @Expose
    private StarRatingCounts starRatingCounts;
    @SerializedName("brandIdCounts")
    @Expose
    private BrandIdCounts brandIdCounts;
    @SerializedName("propertyTypeCounts")
    @Expose
    private PropertyTypeCounts propertyTypeCounts;
    @SerializedName("propertyType")
    @Expose
    private List<PropertyType> propertyType = null;
    @SerializedName("dealTypeCounts")
    @Expose
    private DealTypeCounts dealTypeCounts;
    @SerializedName("minFilterPrice")
    @Expose
    private String minFilterPrice;
    @SerializedName("maxFilterPrice")
    @Expose
    private String maxFilterPrice;
    @SerializedName("maxFilterPricePerStay")
    @Expose
    private String maxFilterPricePerStay;

    public Integer getTotalSizeFiltered() {
        return totalSizeFiltered;
    }

    public void setTotalSizeFiltered(Integer totalSizeFiltered) {
        this.totalSizeFiltered = totalSizeFiltered;
    }

    public CityCounts getCityCounts() {
        return cityCounts;
    }

    public void setCityCounts(CityCounts cityCounts) {
        this.cityCounts = cityCounts;
    }

    public ClusterCounts getClusterCounts() {
        return clusterCounts;
    }

    public void setClusterCounts(ClusterCounts clusterCounts) {
        this.clusterCounts = clusterCounts;
    }

    public AmenityCounts getAmenityCounts() {
        return amenityCounts;
    }

    public void setAmenityCounts(AmenityCounts amenityCounts) {
        this.amenityCounts = amenityCounts;
    }

    public StarRatingCounts getStarRatingCounts() {
        return starRatingCounts;
    }

    public void setStarRatingCounts(StarRatingCounts starRatingCounts) {
        this.starRatingCounts = starRatingCounts;
    }

    public BrandIdCounts getBrandIdCounts() {
        return brandIdCounts;
    }

    public void setBrandIdCounts(BrandIdCounts brandIdCounts) {
        this.brandIdCounts = brandIdCounts;
    }

    public PropertyTypeCounts getPropertyTypeCounts() {
        return propertyTypeCounts;
    }

    public void setPropertyTypeCounts(PropertyTypeCounts propertyTypeCounts) {
        this.propertyTypeCounts = propertyTypeCounts;
    }

    public List<PropertyType> getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(List<PropertyType> propertyType) {
        this.propertyType = propertyType;
    }

    public DealTypeCounts getDealTypeCounts() {
        return dealTypeCounts;
    }

    public void setDealTypeCounts(DealTypeCounts dealTypeCounts) {
        this.dealTypeCounts = dealTypeCounts;
    }

    public String getMinFilterPrice() {
        return minFilterPrice;
    }

    public void setMinFilterPrice(String minFilterPrice) {
        this.minFilterPrice = minFilterPrice;
    }

    public String getMaxFilterPrice() {
        return maxFilterPrice;
    }

    public void setMaxFilterPrice(String maxFilterPrice) {
        this.maxFilterPrice = maxFilterPrice;
    }

    public String getMaxFilterPricePerStay() {
        return maxFilterPricePerStay;
    }

    public void setMaxFilterPricePerStay(String maxFilterPricePerStay) {
        this.maxFilterPricePerStay = maxFilterPricePerStay;
    }

}
