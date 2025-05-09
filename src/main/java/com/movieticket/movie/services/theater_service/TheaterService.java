package com.movieticket.movie.services.theater_service;

import com.movieticket.movie.models.Theater;

import java.util.List;

public interface TheaterService {
    String createTheater(String name, String location);

    List<Theater>getAllTheaters();

    Theater getTheaterById(String theaterId);

    String deleteTheater (String theaterId);

    String updateTheater(String theaterId, String name, String location);

    List<Theater>findTheatersByLocations(String location);

    List<Theater>findTheatersByName(String name);
}
