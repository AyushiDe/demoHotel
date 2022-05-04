package com.ayushi.demo.Service;

import com.ayushi.demo.dto.Hotel;

import java.util.List;

public interface HotelService {

    public List<Hotel> getHotelsFromRapidApi();
    public String getCarsFromRapidApi();
}
