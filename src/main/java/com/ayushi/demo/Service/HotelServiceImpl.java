package com.ayushi.demo.Service;

import com.ayushi.demo.dto.Hotel;
import com.ayushi.demo.dto.SearchHotelsResDto;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    public List<Hotel> getHotelsFromRapidApi() {
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
}
