
package com.ayushi.demo.dto.hotel;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class HotelFeatures {

    @SerializedName("hotelAmenityCodes")
    @Expose
    private List<String> hotelAmenityCodes = null;
    @SerializedName("hotelAmenities")
    @Expose
    private List<HotelAmenity> hotelAmenities = null;

    public List<String> getHotelAmenityCodes() {
        return hotelAmenityCodes;
    }

    public void setHotelAmenityCodes(List<String> hotelAmenityCodes) {
        this.hotelAmenityCodes = hotelAmenityCodes;
    }

    public List<HotelAmenity> getHotelAmenities() {
        return hotelAmenities;
    }

    public void setHotelAmenities(List<HotelAmenity> hotelAmenities) {
        this.hotelAmenities = hotelAmenities;
    }

}
