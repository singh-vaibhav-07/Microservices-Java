package com.epam.ratingservice.services;

import com.epam.ratingservice.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    // create
    Rating create(Rating rating);

    // get all ratings
    List<Rating> getAllRatings();

    // get all by user id
    List<Rating> getAllByUserId(String userId);

    // get all by hotel
    List<Rating> getAllByHotelId(String hotelId);

}
