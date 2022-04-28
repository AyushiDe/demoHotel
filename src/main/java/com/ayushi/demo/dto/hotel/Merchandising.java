
package com.ayushi.demo.dto.hotel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Merchandising {

    @SerializedName("topBooked")
    @Expose
    private TopBooked topBooked;

    public TopBooked getTopBooked() {
        return topBooked;
    }

    public void setTopBooked(TopBooked topBooked) {
        this.topBooked = topBooked;
    }

}
