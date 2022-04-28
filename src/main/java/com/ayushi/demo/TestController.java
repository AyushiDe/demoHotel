package com.ayushi.demo;

import com.ayushi.demo.dto.hotel.Hotel;
import com.ayushi.demo.dto.hotel.SearchHotelsResDto;
import com.ayushi.demo.repo.HotelRepository;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    HotelRepository hotelRepository;

    @GetMapping(value = "/save-hotels")
    private String saveHotels() {
        List<Hotel> hotels = getHotelsFromRapidApi();
        hotelRepository.saveAll(hotels);
        return "Success";
    }

    @NotNull
    private List<Hotel> getHotelsFromRapidApi() {
        try {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://priceline-com-provider.p.rapidapi.com/v1/hotels/search?date_checkin=2022-06-17&location_id=3000035821&date_checkout=2022-06-18&sort_order=HDR&amenities_ids=FINTRNT%2CFBRKFST&rooms_number=1&star_rating_ids=3.0%2C3.5%2C4.0%2C4.5%2C5.0")
                    .get()
                    .addHeader("X-RapidAPI-Host", "priceline-com-provider.p.rapidapi.com")
                    .addHeader("X-RapidAPI-Key", "5a5d0c76ddmshaf47d6b2fd5d7adp12ec7djsn93ad59625eb0")
                    .build();

            Response response = client.newCall(request).execute();

            Gson gson = new Gson();
            SearchHotelsResDto responseDto = gson.fromJson(response.body().string(), SearchHotelsResDto.class);

            return responseDto.getHotels();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
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