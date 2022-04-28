package com.ayushi.demo;

import com.ayushi.demo.Service.HotelService;
import com.ayushi.demo.dto.Hotel;
import com.ayushi.demo.repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {
    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    HotelService hotelService;

    @GetMapping(value = "/save-hotels")
    private String saveHotels() {
        List<Hotel> hotels = hotelService.getHotelsFromRapidApi();
        hotelRepository.saveAll(hotels);
        return "Success";
    }


    @GetMapping(value = "hotels")
    private List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @GetMapping(value = "hotels/cityName/{cityName}")
    private List<Hotel> getHotelByCity(@PathVariable("cityName") String cityName) {
        return hotelRepository.findHotelByCity(cityName);
    }

    @GetMapping(value = "hotels/name/{name}")
    private List<Hotel> getHotelByName(@PathVariable("name") String name) {
        return hotelRepository.findByHotelName("." + name + ".");
    }
}