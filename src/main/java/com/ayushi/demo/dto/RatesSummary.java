
package com.ayushi.demo.dto;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class RatesSummary {

    @SerializedName("minPrice")
    @Expose
    private String minPrice;
    @SerializedName("minCurrencyCode")
    @Expose
    private String minCurrencyCode;
    @SerializedName("pclnId")
    @Expose
    private String pclnId;
    @SerializedName("freeCancelableRateAvail")
    @Expose
    private Boolean freeCancelableRateAvail;
    @SerializedName("payWhenYouStayAvailable")
    @Expose
    private Boolean payWhenYouStayAvailable;
    @SerializedName("minRatePromos")
    @Expose
    private List<MinRatePromo> minRatePromos = null;
    @SerializedName("availablePromos")
    @Expose
    private List<AvailablePromo> availablePromos = null;
    @SerializedName("gid")
    @Expose
    private Integer gid;
    @SerializedName("rateIdentifier")
    @Expose
    private String rateIdentifier;
    @SerializedName("ccNotRequiredAvailable")
    @Expose
    private Boolean ccNotRequiredAvailable;
    @SerializedName("applePayRateAvailable")
    @Expose
    private Boolean applePayRateAvailable;
    @SerializedName("minStrikePrice")
    @Expose
    private String minStrikePrice;
    @SerializedName("roomLeft")
    @Expose
    private Integer roomLeft;
    @SerializedName("programName")
    @Expose
    private String programName;
    @SerializedName("strikeThroughPrice")
    @Expose
    private String strikeThroughPrice;
    @SerializedName("merchandisingFlag")
    @Expose
    private Boolean merchandisingFlag;
    @SerializedName("minRateSavingsPercentage")
    @Expose
    private Integer minRateSavingsPercentage;
    @SerializedName("minRateStrikeThroughPrice")
    @Expose
    private String minRateStrikeThroughPrice;

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getMinCurrencyCode() {
        return minCurrencyCode;
    }

    public void setMinCurrencyCode(String minCurrencyCode) {
        this.minCurrencyCode = minCurrencyCode;
    }

    public String getPclnId() {
        return pclnId;
    }

    public void setPclnId(String pclnId) {
        this.pclnId = pclnId;
    }

    public Boolean getFreeCancelableRateAvail() {
        return freeCancelableRateAvail;
    }

    public void setFreeCancelableRateAvail(Boolean freeCancelableRateAvail) {
        this.freeCancelableRateAvail = freeCancelableRateAvail;
    }

    public Boolean getPayWhenYouStayAvailable() {
        return payWhenYouStayAvailable;
    }

    public void setPayWhenYouStayAvailable(Boolean payWhenYouStayAvailable) {
        this.payWhenYouStayAvailable = payWhenYouStayAvailable;
    }

    public List<MinRatePromo> getMinRatePromos() {
        return minRatePromos;
    }

    public void setMinRatePromos(List<MinRatePromo> minRatePromos) {
        this.minRatePromos = minRatePromos;
    }

    public List<AvailablePromo> getAvailablePromos() {
        return availablePromos;
    }

    public void setAvailablePromos(List<AvailablePromo> availablePromos) {
        this.availablePromos = availablePromos;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getRateIdentifier() {
        return rateIdentifier;
    }

    public void setRateIdentifier(String rateIdentifier) {
        this.rateIdentifier = rateIdentifier;
    }

    public Boolean getCcNotRequiredAvailable() {
        return ccNotRequiredAvailable;
    }

    public void setCcNotRequiredAvailable(Boolean ccNotRequiredAvailable) {
        this.ccNotRequiredAvailable = ccNotRequiredAvailable;
    }

    public Boolean getApplePayRateAvailable() {
        return applePayRateAvailable;
    }

    public void setApplePayRateAvailable(Boolean applePayRateAvailable) {
        this.applePayRateAvailable = applePayRateAvailable;
    }

    public String getMinStrikePrice() {
        return minStrikePrice;
    }

    public void setMinStrikePrice(String minStrikePrice) {
        this.minStrikePrice = minStrikePrice;
    }

    public Integer getRoomLeft() {
        return roomLeft;
    }

    public void setRoomLeft(Integer roomLeft) {
        this.roomLeft = roomLeft;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getStrikeThroughPrice() {
        return strikeThroughPrice;
    }

    public void setStrikeThroughPrice(String strikeThroughPrice) {
        this.strikeThroughPrice = strikeThroughPrice;
    }

    public Boolean getMerchandisingFlag() {
        return merchandisingFlag;
    }

    public void setMerchandisingFlag(Boolean merchandisingFlag) {
        this.merchandisingFlag = merchandisingFlag;
    }

    public Integer getMinRateSavingsPercentage() {
        return minRateSavingsPercentage;
    }

    public void setMinRateSavingsPercentage(Integer minRateSavingsPercentage) {
        this.minRateSavingsPercentage = minRateSavingsPercentage;
    }

    public String getMinRateStrikeThroughPrice() {
        return minRateStrikeThroughPrice;
    }

    public void setMinRateStrikeThroughPrice(String minRateStrikeThroughPrice) {
        this.minRateStrikeThroughPrice = minRateStrikeThroughPrice;
    }

}
