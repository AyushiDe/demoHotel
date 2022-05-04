package com.ayushi.demo.Controller;

import com.ayushi.demo.Service.HotelService;
import com.ayushi.demo.dto.Hotel;
import com.ayushi.demo.repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/hotels")
    public void addHotel(@RequestBody Hotel hotel){
        hotelRepository.save(hotel);
    }

    @RequestMapping(value = "/hotels", method = RequestMethod.PUT)
    public void saveOrUpdateHotel(@RequestBody Hotel hotel){
        hotelRepository.save(hotel);
    }
    @GetMapping(value = "cars")
    public String getCars(){
        return hotelService.getCarsFromRapidApi();
    }

    @GetMapping(value = "hotels/hotelAmenities")
    private List<Hotel> getHotelByAmenities(@RequestParam("code") String code, @RequestParam("hotelType") String hotelType)
    {
        return hotelRepository.findByHotelAmenities(code, hotelType);
    }

    @GetMapping(value = "hotels/starRating/{starRating}")
    private List<Hotel> getHotelByRatings(@PathVariable("starRating") Double starRating) {
        return hotelRepository.findByHotelRating(starRating);
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