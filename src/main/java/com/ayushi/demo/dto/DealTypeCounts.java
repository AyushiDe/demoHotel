
package com.ayushi.demo.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DealTypeCounts {

    @SerializedName("EXPRESS_DEAL")
    @Expose
    private Integer expressDeal;

    public Integer getExpressDeal() {
        return expressDeal;
    }

    public void setExpressDeal(Integer expressDeal) {
        this.expressDeal = expressDeal;
    }

}
