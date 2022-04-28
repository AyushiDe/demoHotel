
package com.ayushi.demo.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class MinRatePromo {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("discountPercentage")
    @Expose
    private Integer discountPercentage;
    @SerializedName("showDiscount")
    @Expose
    private Boolean showDiscount;
    @SerializedName("dealType")
    @Expose
    private String dealType;
    @SerializedName("isVariableMarkupPromo")
    @Expose
    private Boolean isVariableMarkupPromo;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Boolean getShowDiscount() {
        return showDiscount;
    }

    public void setShowDiscount(Boolean showDiscount) {
        this.showDiscount = showDiscount;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public Boolean getIsVariableMarkupPromo() {
        return isVariableMarkupPromo;
    }

    public void setIsVariableMarkupPromo(Boolean isVariableMarkupPromo) {
        this.isVariableMarkupPromo = isVariableMarkupPromo;
    }

}
