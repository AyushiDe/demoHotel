package com.ayushi.demo.repo;

import com.ayushi.demo.dto.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface HotelRepository extends MongoRepository<Hotel, String> {
    @Query("{'location.address.cityName' : ?0}")
    List<Hotel> findHotelByCity(String cityName);

    @Query(value = "{'name': {$regex : ?0, $options: 'i'}}")
    List<Hotel> findByHotelName(String regexString);

    @Query(value = "{'starRating' : {$gte : ?0}}")
    List<Hotel> findByHotelRating(Double starRating);

    @Query(value ="{'hotelFeatures.hotelAmenities.code' : ?0}, {'hotelType' : ?1}")
    List<Hotel> findByHotelAmenities(String code, String hotelType);
}