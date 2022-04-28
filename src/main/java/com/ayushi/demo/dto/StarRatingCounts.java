
package com.ayushi.demo.dto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class StarRatingCounts {

    @SerializedName("3.0")
    @Expose
    private Integer _30;
    @SerializedName("3.5")
    @Expose
    private Integer _35;

    public Integer get30() {
        return _30;
    }

    public void set30(Integer _30) {
        this._30 = _30;
    }

    public Integer get35() {
        return _35;
    }

    public void set35(Integer _35) {
        this._35 = _35;
    }

}
