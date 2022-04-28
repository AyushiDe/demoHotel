
package com.ayushi.demo.dto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Generated("jsonschema2pojo")
@Document(collection = "hotels")
public class Hotel {

    @Id
    @SerializedName("hotelId")
    @Expose
    private String hotelId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("starRating")
    @Expose
    private Double starRating;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("thumbnailUrl")
    @Expose
    private String thumbnailUrl;
    @SerializedName("hotelFeatures")
    @Expose
    private HotelFeatures hotelFeatures;
    @SerializedName("overallGuestRating")
    @Expose
    private Double overallGuestRating;
    @SerializedName("totalReviewCount")
    @Expose
    private Double totalReviewCount;
    @SerializedName("proximity")
    @Expose
    private Double proximity;
    @SerializedName("ratesSummary")
    @Expose
    private RatesSummary ratesSummary;
    @SerializedName("allInclusiveRateProperty")
    @Expose
    private Boolean allInclusiveRateProperty;
    @SerializedName("displayRank")
    @Expose
    private Double displayRank;
    @SerializedName("recmdScore")
    @Expose
    private Double recmdScore;
    @SerializedName("merchandising")
    @Expose
    private Merchandising merchandising;
    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("keyFeatures")
    @Expose
    private List<String> keyFeatures = null;
    @SerializedName("globalDealScore")
    @Expose
    private Double globalDealScore;
    @SerializedName("badges")
    @Expose
    private List<Badge> badges = null;
    @SerializedName("pclnId")
    @Expose
    private String pclnId;
    @SerializedName("hotelType")
    @Expose
    private String hotelType;
    @SerializedName("dealTypes")
    @Expose
    private List<String> dealTypes = null;
    @SerializedName("bedChoiceAvailable")
    @Expose
    private Boolean bedChoiceAvailable;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getStarRating() {
        return starRating;
    }

    public void setStarRating(Double starRating) {
        this.starRating = starRating;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public HotelFeatures getHotelFeatures() {
        return hotelFeatures;
    }

    public void setHotelFeatures(HotelFeatures hotelFeatures) {
        this.hotelFeatures = hotelFeatures;
    }

    public Double getOverallGuestRating() {
        return overallGuestRating;
    }

    public void setOverallGuestRating(Double overallGuestRating) {
        this.overallGuestRating = overallGuestRating;
    }

    public Double getTotalReviewCount() {
        return totalReviewCount;
    }

    public void setTotalReviewCount(Double totalReviewCount) {
        this.totalReviewCount = totalReviewCount;
    }

    public Double getProximity() {
        return proximity;
    }

    public void setProximity(Double proximity) {
        this.proximity = proximity;
    }

    public RatesSummary getRatesSummary() {
        return ratesSummary;
    }

    public void setRatesSummary(RatesSummary ratesSummary) {
        this.ratesSummary = ratesSummary;
    }

    public Boolean getAllInclusiveRateProperty() {
        return allInclusiveRateProperty;
    }

    public void setAllInclusiveRateProperty(Boolean allInclusiveRateProperty) {
        this.allInclusiveRateProperty = allInclusiveRateProperty;
    }

    public Double getDisplayRank() {
        return displayRank;
    }

    public void setDisplayRank(Double displayRank) {
        this.displayRank = displayRank;
    }

    public Double getRecmdScore() {
        return recmdScore;
    }

    public void setRecmdScore(Double recmdScore) {
        this.recmdScore = recmdScore;
    }

    public Merchandising getMerchandising() {
        return merchandising;
    }

    public void setMerchandising(Merchandising merchandising) {
        this.merchandising = merchandising;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public List<String> getKeyFeatures() {
        return keyFeatures;
    }

    public void setKeyFeatures(List<String> keyFeatures) {
        this.keyFeatures = keyFeatures;
    }

    public Double getGlobalDealScore() {
        return globalDealScore;
    }

    public void setGlobalDealScore(Double globalDealScore) {
        this.globalDealScore = globalDealScore;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    public String getPclnId() {
        return pclnId;
    }

    public void setPclnId(String pclnId) {
        this.pclnId = pclnId;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public List<String> getDealTypes() {
        return dealTypes;
    }

    public void setDealTypes(List<String> dealTypes) {
        this.dealTypes = dealTypes;
    }

    public Boolean getBedChoiceAvailable() {
        return bedChoiceAvailable;
    }

    public void setBedChoiceAvailable(Boolean bedChoiceAvailable) {
        this.bedChoiceAvailable = bedChoiceAvailable;
    }

}
