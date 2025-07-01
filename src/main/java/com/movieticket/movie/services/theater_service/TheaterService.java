package com.movieticket.movie.services.theater_service;


import com.movieticket.movie.models.Theater;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TheaterService {
    String createTheater(String theaterId, String name, String location);

    List<Theater> getAllTheaters();

    Theater getTheaterId(String theaterid);
}
